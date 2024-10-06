package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {

        //variables
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
        int[] array3;
        //test effectué pour affecter la taille du tableau final
        if(array.length == array2.length) {
            array3 = new int[array.length];
            // remplissage de array3
            for (int i = 0; i < array3.length; i++) {
                array3[i] = array[i]+array2[i];
            }
            //affichage array3
            for (int a = 0; a < array3.length; a++) {
                System.out.println("array3["+a+"] : "+array3[a]+ " \n");
            }
        }else{
            System.out.println("Test Impossible !!!");
        }

    }

}
