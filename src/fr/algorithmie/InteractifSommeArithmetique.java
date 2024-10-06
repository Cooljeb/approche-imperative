package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in) ;
        int nb ;
        int sommeEntiers = 0; // sommes des entiers
        // début de programme
        System.out.println("Saisir un chiffre svp ? ");
        nb = scanner.nextInt();
        //Affichage
        System.out.println("Somme des entiers compris entre 1 et "+nb+" :" );
        for (int i = 1; i<=nb ; i++) {
            sommeEntiers+=i;
        }
        System.out.println(sommeEntiers);
    }
}
