package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
    /**
     * La règle de ce jeu est très simple : 21 bâtonnets en bois sont alignés les
     * uns à côté des autres, entre les deux joueurs. A tour de rôle, chacun des
     * 2 concurrents va devoir en retirer un, deux ou trois bâtonnets à l'endroit
     * de son choix. Le but est bien entendu de laisser le dernier bâtonnet à
     * son adversaire !
     *
     */
    public static void main(String[] args) {

        final int TOTAL = 21;
        int reste;
        int scj1;
        int j; //joueur

        int opt = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int aleatoire ;// nombre aléatoire compris entre 1 et 3
        char rep='o'; // réponnse de l'utilisateur
        // Affichage du menu
        while(rep == 'o' || rep=='O') { // condition pour commencer le programme
            j=0; // initialisation du joueur à 0
            reste = TOTAL;
            do { // boucle d'affichage du menu tant que le choix utilisateur est différent de 1,2 ou 3
                System.out.println("""
                        ***Jeu des 21 Bâtons***
                        Menu :
                         1. Joueur 1 commence
                         2. Joueur 2 commence
                         3. Quitter\s
                        (choisir l'option 1, 2 ou 3)""");
                opt = sc.nextInt(); // saisie de l'option de menu

                switch (opt) { // Traitement des différentes options de menu

                    case 1:
                        //J1 commence
                        j = 1;
                        break;
                    case 2:
                        //J2 commence
                        j = 2;
                        break;
                    case 3:
                        //Sortie de programme
                        System.out.println("Au revoir !!!");
                        System.exit(0);
                        break;
                    default:
                        // Traitement de l'erreur de saisie
                        System.out.println("Option de menu inconnue ❌");
                }
            } while (opt !=1 && opt !=2 && opt != 3);

            System.out.println("Début de partie, il reste "+TOTAL+" bâtons"); // Affichage de début de partie

            while(reste<=TOTAL && reste>1 ){ // boucle de départ du jeu on continue tant que reste <= à total et < à 1

                if (j==1) { // j=1 Joueur 1 commence
                    System.out.println("Au Joueur 1 de jouer");
                    scj1 = sc.nextInt();
                    while(scj1<1 || scj1>3){ // La saisie doit être comprise entre 1 et 3
                        System.out.println("❌❌ SAISIE NON AUTORISEE (UNIQUEMENT ENTRE 1 ET 3 (INCLUS)), RECOMMENCER !");
                        scj1 = sc.nextInt();
                    }
                    reste-=scj1;
                    System.out.println("il reste "+reste+" bâtons");
                    j++;
                }else { // sinon j2 commence (pas de test le choix 3 car on sort du programme
                    //boucle pour ne pas autoriser la génération d'un nombre aléatoire à 0
                    do{
                        aleatoire =  r.nextInt(4);
                    }while (aleatoire==0);
                    System.out.println("le joueur 2 a joué :" +aleatoire);
                    reste-=aleatoire;
                    System.out.println("il reste "+reste+" bâtons");
                    j--;
                }

            }
            if(j==1 && reste == 0||reste == 1){
                System.out.println("Joueur "+j+" a perdu, tu as le dernier bâton");
            }else{
                System.out.println("Joueur "+j+" a perdu, tu as le dernier bâton");
            }

            // Boucle d'interrogation du choix utilisateur de continuer ou non l'aventure
            do{
                System.out.println("Voulez-vous continuer (O/N) ? (o pour Oui, n pour Non, accepté)");
                String temp ;
                Scanner scan2 = new Scanner(System.in);
                temp = scan2.nextLine();
                rep = temp.charAt(temp.length()-1);//récupération du contenu de la chaine de caractère qui est O/o/N/n

                if (rep != 'O' && rep != 'o' && rep != 'n' &&  rep != 'N') {
                    System.out.println("Réponse incorrecte");
                }
            } while(rep != 'O' && rep != 'o' && rep != 'n' &&  rep != 'N');
        }
        System.out.println("Au revoir !!!");
        System.exit(0);
    }
}
