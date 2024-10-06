package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

    public static void main(String[] args) {
        //déclaration et initialisation du tableau nommé array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int[] arrayCopy = new int [array.length];
        int cpt = array.length-1; // compteur longueur tableay array
        int cpt2 = 0; // compteur pour remplissage de la copie de tableau

       //remplissage d tabelau arrayCoppy
        while (cpt>=0) {
            arrayCopy[cpt2]=array[cpt];
            cpt--;
            cpt2++;
        }


        //affichage des tableaux
        System.out.println("Tableau array\n");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]+ "\n" );
        }

        System.out.println("\n Tableau arrayCopy\n");
        for (int i = 0; i < arrayCopy.length ; i++) {
            System.out.println(arrayCopy[i]+ "\n" );
        }


    }
}
