package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        //déclaration et initialisation du tableau nommé array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("Afficher l’ensemble des éléments du tableau grâce à une boucle\n");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]+ "\n" );
        }
        //Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("\nAfficher l’ensemble des éléments dans l’ordre inverse du tableau\n");
        for (int i = array.length-1; i>=0  ; i--) {
            System.out.println(array[i]+ "\n" );
        }

        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        System.out.println("Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy");

        int[] arrayCopy = Arrays.copyOf(array, array.length);

        //Affichage du nouveau tableau, qui n'a que le nom de nouveau ^^

        System.out.println("Affichage du nouveau tableau, qui n'a que le nom de nouveau ^^\n");
        for (int i = 0; i < arrayCopy.length ; i++) {
            System.out.println(arrayCopy[i]+ "\n" );
        }
    }
}
