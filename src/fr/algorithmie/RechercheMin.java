package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {

        //variables

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}; //tableau
        int min = array[0]; // Initialisation de max à  la 1ère valeur de tableau array
        //Recherche de la valeur min

        for (int i = 0; i < array.length ; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }

        //Affichage de la valeur min
        System.out.println("Valeur max du tableau array : " +min);
    }
}
