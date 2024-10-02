package fr.boucles;

public class ExerciceTableauEntier {

    public static void main(String[] args) {

        //Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
        int tabInt [] = {1,2,3,4,5,6,7,8,9,10};

        //Affichez le premier élément du tableau
        System.out.println("Affichez le premier élément du tableau");
        System.out.println(tabInt[0]);

        //Affichez la longueur du tableau en utilisant la propriété length
        System.out.println("\nAffichez la longueur du tableau en utilisant la propriété length");
        System.out.println("Longueur tableau = "+tabInt.length);

        //Affichez le dernier élément du tableau en utilisant la propriété length
        System.out.println("\nAffichez le dernier élément du tableau en utilisant la propriété length");
        System.out.println("Dernier élément du tableau  = "+ tabInt[tabInt.length -1]);

        //Modifiez la valeur de l’élément d’index 4 et donnez-lui la valeur 8.
        System.out.println("\nModifiez la valeur de l’élément d’index 4 et donnez-lui la valeur 8.");
        tabInt[4] = 8;

        // Affichage du tableau après modification
        for (int i = 0; i < tabInt.length ; i++) {
            System.out.println( "Index "+i+ " ==> " +tabInt[i]+ "\n" );
        }
    }
}
