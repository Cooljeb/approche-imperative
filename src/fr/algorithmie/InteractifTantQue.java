package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in) ;
        int nb ;

        System.out.println("choisir un chiffre compris entre 1 et 10 svp ");
        nb = scanner.nextInt();
        //boucle de test si la valeur n'est pas correcte, on demande une nouvelle saisie
        while (nb < 1 || nb > 10) {
            System.out.println("Chiffre/nombre incorrect, recommencer la saisie");
            nb = scanner.nextInt();
        }
        //affichage
        System.out.println("Le nombre saisi est :" +nb);
        System.exit(0);


    }

}
