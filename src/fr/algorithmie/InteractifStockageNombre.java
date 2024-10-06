package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int[] tabInt = new int [0]; // Création d'un tableau de taille 0
        int nb=0; //nombre saisi par l'utilisateur
        int opt=0; // option de menu
        int tailleMax = 0;//tailleMax du tableau
        int cpt = 0; // compteur
        char rep='o'; // réponnse de l'utilisateur
        // Affichage du menu
        while(rep == 'o' || rep=='O')  { // condition pour commencer le programme

            System.out.println("""
                    Menu :
                     1. Ajouter un nombre
                     2. Afficher les nombres existants
                     3. Quitter\s
                    (choisir l'option 1, 2 ou 3)""");

            opt = scanner.nextInt(); // saisie de l'option de menu

             switch (opt) { // Traitement des différentes options de menu

                 case 1:
                    //Stockage des saisies dans un tableau d'entiers
                     System.out.println("Saisir un nombre");
                     nb = scanner.nextInt(); // saisie du nombre
                     tailleMax = tabInt.length; // on récupère la taille du tableau

                     if (cpt < tailleMax) { // en fonction de ça on ajoute dans l'actuel tableau sinon on l'agrandit
                         tabInt[cpt] = nb;
                         cpt++;
                     } else {
                         tabInt = Arrays.copyOf(tabInt, tabInt.length + 1);
                         tabInt[cpt] = nb;
                         cpt++;
                     }
                     break;

                 case 2:
                     //Affichage du tableau
                     if (tabInt.length == 0) {
                         System.out.println("Actuellement le tableau est vide");

                     } else {
                         System.out.println("Voici les saisies déjà effectuées:\n");
                         for (int i = 0; i < tabInt.length; i++) {
                             System.out.println(tabInt[i]);
                         }
                     }
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
        // fin de la boucle déxéction du programme, on sort du programme
        System.out.println("Au revoir !!!");
        System.exit(0);
    }

}
