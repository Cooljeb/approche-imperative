package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {

        //variables
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int nbElComm = 0; // nombre d'éléments en commun
        int k = 0 ; //compteur

        /* Ici on par compare le premier élément de array3 avec le premier de array1
        en cas d'égalité on incrémente le compteur nbElComm, sinon on passe à la comparaison de l'élément
        suivant de array1 et ainsi de suite
        une fois qu'on a comparé tous les éléments de array1 avec l'élément de array2, on passe à l'élément suivant de
        array 2 */

        for (int i = 0; i <array2.length ; i++) {
           while (k < array1.length ) {
                if(array2[i]==array1[k]) {
                    nbElComm++;
                    k++;
                }else{
                    k++;
                }
            }
           k=0;
        }
        // Affichage du nombre d'éléments communs
        System.out.println("Nombre d'éléments commun : " +nbElComm);
    }
}
