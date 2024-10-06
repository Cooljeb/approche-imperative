package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        //variables

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int[] array3; // tableau final contenant la somme des 2 tableaux
        int tailleMax = 0; //taille maximale du futur tableau

        // définition de la taille maximale du tableau finale

        if(array.length == array2.length){
            tailleMax = array.length; // taille des 2 tableaux identique, on définit tailleMax par la taille du premier
        } else if (array.length> array2.length) {
            tailleMax = array.length;
        } else {
            tailleMax = array2.length;;
        }
        //initialisation array3
        array3 = new int [tailleMax];
        //remplissage des tableaux

        for (int i = 0; i < array3.length ; i++) {
            while(i<array2.length){
                array3[i] = array[i]+array2[i];
                i++;
            }
            array3[i]=array[i];
        }
        //affichage array3
        for (int a = 0; a < array3.length; a++) {
            System.out.println("array3["+a+"] : "+array3[a]);
        }
    }
}
