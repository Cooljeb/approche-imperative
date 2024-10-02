package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        //Affichez tous les nombres de 1 à 10
        System.out.println("Affichez tous les nombres de 1 à 10 \n");
        int nb = 1; // variable permettant d'afficher les autres chiffres ensuite

        do {
            System.out.println("Nombre " +nb+ "\n");
            nb++;
        }while (nb<=10);

        //Affichez 20 fois votre nom et votre prénom
        System.out.println("\n Affichez 20 fois votre nom et votre prénom \n");
        nb = 1; // je réutilise cette variable pour l'exercice

        for ( nb = 1; nb <=20 ; nb++) {
            System.out.println(nb + ")" + " Joseph BROU \n");
        }

        //Affichez les éléments pairs de 2 à 100
        System.out.println("\n Affichez les éléments pairs de 2 à 100 \n");

        nb = 2; // je réutilise cette variable pour l'exercice

        while (nb<=100) {
            if (nb%2==0) {
                System.out.println(nb);
                nb++;
            }else {
               nb++;
            }
        }

        //Affichez les éléments impairs de 1 à 99

        System.out.println("\n Affichez les éléments impairs de 1 à 99 \n");

        nb = 1; // je réutilise cette variable pour l'exercice

        while (nb<=99) {
            if (nb%2==1) {
                System.out.println(nb);
                nb++;
            }else {
                nb++;
            }
        }


    }
}
