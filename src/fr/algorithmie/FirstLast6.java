package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        // variable de valorisation de la consigne
        boolean verif = false;

        // cas avec dernier élément  = 6
        int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8,45,78,6} ;

        // cas avec premier élément  = 6
        int[] array2= {6,3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8,45,78} ;

        // cas avec des éléments mais pas de 6 permettant de passer verif à "true
        int[] array3= {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8,45,78} ;

        // cas un tableau vide
        int [] array4 = {}; // cas avec 0 élément



        if(array.length >0) {
            for (int i = 0; i <array.length ; i++) {
                if (array[0]==6||array[array.length-1]==6){
                    verif=true;
                }else{
                    i++;
                }
            }
        }
        //affichage de verif
        System.out.println("Valeur de verif "+verif);

        //réinitialisation de verif à false
        verif = false;

        if(array2.length >0) {
            for (int i = 0; i <array2.length ; i++) {
                if (array2[0]==6||array2[array2.length-1]==6){
                    verif=true;
                }else{
                    i++;
                }
            }
        }
        //affichage de verif
        System.out.println("Valeur de verif "+verif);

        //réinitialisation de verif à false
        verif = false;

        if(array3.length >0) {
            for (int i = 0; i <array3.length ; i++) {
                if (array3[0]==6||array3[array3.length-1]==6){
                    verif=true;
                }else{
                    i++;
                }
            }
        }
        //affichage de verif
        System.out.println("Valeur de verif "+verif);

        //réinitialisation de verif à false
        verif = false;

        if(array4.length >0) {
            for (int i = 0; i <array4.length ; i++) {
                if (array4[0]==6||array4[array4.length-1]==6){
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
