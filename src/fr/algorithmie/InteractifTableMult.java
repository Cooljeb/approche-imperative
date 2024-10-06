package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in) ;
        int nb ;

        System.out.println("choisir un chiffre compris entre 1 et 10 svp ");
        nb = scanner.nextInt();

        while (nb < 1 || nb > 10) {
            System.out.println("Chiffre/nombre incorrect, recommencer la saisie");
            nb = scanner.nextInt();
        }
        //affichage
        System.out.println("Table de "+nb+":\n" );
        for (int i = 1; i <=10 ; i++) {
            System.out.println(nb + " x "+i+" = " +i*nb);
        }
        System.exit(0);
    }
}
