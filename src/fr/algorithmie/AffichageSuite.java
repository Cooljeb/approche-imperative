package fr.algorithmie;

public class AffichageSuite {

    public static void main(String[] args) {

        //Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus\n");

        for (int i = 1; i <=10 ; i++) {
            System.out.println("Nombre "+i);
        }

        //Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("\nUtiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus\n");

        for (int i = 0; i <=10 ; i++) {
            if(i%2==0) {
                System.out.println("Nombre "+i);
            }
        }

        //Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("\nUtiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus\n");

        for (int i = 0; i <=9 ; i++) {
            if(i%2==1) {
                System.out.println("Nombre "+i);
            }
        }

        //Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("\nUtiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus\n");
        int i=1; //déclaration d'un compteur ex
        while(i<=10){
            System.out.println("Nombre "+i);
            i++;
        }

        //Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.println("\nUtiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus\n");
        i = 0; // réutilisation du compteur "i" dans le cadre de l'exercice et affection de la valeur 0

        while(i<=10){
            if(i%2==0) {
                System.out.println("Nombre "+i);
                i++;
            }else{
                i++;
            }
        }

        //Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("\nUtiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus\n");
        i = 0; // réutilisation du compteur "i" dans le cadre de l'exercice et affection de la valeur 0

        while(i<=9){
            if(i%2==1) {
                System.out.println("Nombre "+i);
                i++;
            }else{
                i++;
            }
        }
    }
}
