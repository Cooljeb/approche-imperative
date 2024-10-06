package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        //variables
        Random r = new Random();
        int aleatoire = r.nextInt(101);// nombre aléatoire compris entre 1 et 100
        Scanner scanner = new Scanner(System.in) ;
        int nb;
        int cpt=1; // compteur par défaut à 1 car on joue au moins 1 fois

        //début du jeu
        System.out.println("Un chiffre aléatoire entre 1 et 100 a été généré, à toi de le trouver 😘 ");
        nb = scanner.nextInt(); // saisie initiale

        while(nb != aleatoire){ //
            if(nb>aleatoire){
                System.out.println("Au dessus");
            }else{
                System.out.println("En dessous");
            }
            cpt++;
            nb = scanner.nextInt();
        }
        System.out.println("Bravo champion.ne, tu as trouvé le nombre "+aleatoire+" en "+cpt+" essai(s) !!!");

    }
}
