package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        // variable de valorisation de la consigne
        boolean verif = false;

        // cas avec 1 élément
        int[] array = {3} ;

        // cas avec 2 éléments différents
        int[] array2= {6,3} ;

        // cas avec 2 éléments identiques
        int[] array3= {6,6} ;

        // cas un tableau vide
        int [] array4 = {}; // cas avec 0 élément

        if(array.length >0) {
            for (int i = 0; i <array.length ; i++) {
                if (array[0]==array[array.length-1]){
                    verif=true;
                }else{
                    i++;
                }
            }
        }
        //affichage de verif
        System.out.println("Valeur de verif "+verif);

        //réinitialisation de vérif à false
        verif = false;

        if(array2.length >0) {
            for (int i = 0; i <array2.length ; i++) {
                if (array2[0]==array2[array2.length-1]){
                    verif=true;
                }else{
                    i++;
                }
            }
        }
        //affichage de verif
        System.out.println("Valeur de verif "+verif);

        //réinitialisation de vérif à false
        verif = false;

        if(array3.length >0) {
            for (int i = 0; i <array3.length ; i++) {
                if (array3[0]==array3[array3.length-1]){
                    verif=true;
                }else{
                    i++;
                }
            }
        }
        //affichage de verif
        System.out.println("Valeur de verif "+verif);

        //réinitialisation de vérif à false
        verif = false;

        if(array4.length >0) {
            for (int i = 0; i <array4.length ; i++) {
                if (array4[0]==array4[array4.length-1]){
                    verif=true;
                }else{
                    i++;
                }
            }
        }
        //affichage de verif
        System.out.println("Valeur de verif "+verif);
    }
}
