package fr.algorithmie;

public class RechercheMax {

    public static void main(String[] args) {
        //variables

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int max = array[0]; // Initialisation de max à  la 1ère valeur de tableau array

        //Recherche de la valeur Max

        for (int i = 0; i < array.length ; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }

        //Affichage de la valeur max
        System.out.println("Valeur max du tableau array : " +max);
    }
}
