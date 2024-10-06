package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args) {
        // déclaration du tableau

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3\n");

        for (int i = 0; i < array.length ; i++) {
            if(array[i]>3) {
                System.out.println("Index "+i+" => "+array[i] + "\n");
            }
        }

        //Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        System.out.println("\nCombiner une boucle et un test de manière à n’afficher que les entiers pairs\n");
        for (int i = 0; i < array.length ; i++) {
            if(array[i]%2==0) {
                System.out.println("Index "+i+" => "+array[i] + "\n");
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant index pairs
        System.out.println("\nCombiner une boucle et un test de manière à n’afficher que valeurs des index pairs\n");
        for (int i = 0; i < array.length ; i++) {
            if(i%2==0) {
                System.out.println("Index "+i+" => "+array[i] + "\n");
            }
        }

        //Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.println("\nCombiner une boucle et un test de manière à n’afficher que les entiers impairs\n");
        for (int i = 0; i < array.length ; i++) {
            if(array[i]%2==1) {
                System.out.println("Index "+i+" => "+array[i] + "\n");
            }
        }
    }
}
