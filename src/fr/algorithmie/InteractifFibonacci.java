package fr.algorithmie;
import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nb = 0; // nombre saisi par l'utilisateur

        //saisie par l'utilisateur d'un nombre
        System.out.println("Saisir un nombre");
        nb = sc.nextInt();

        //création d'un tableau de la taille du nombre saisi par l'utilisateur
        int[] tab = new int[nb];
        //tab[0] + tab[1]; // La suite de Fibonacci est une suite qui commence par 0 et 1
        for (int i = 0; i < tab.length; i++) {

            if (i == 0) {
                tab[i] = i; // de fait tab[0] = 0
            } else if (i == 1) {
             tab[i] =i; // de fait tab[1] = 1
            } else {
                tab[i] = tab[i - 2] + tab[i - 1]; // le rang N est égal à la somme des nombres de rangs N-1 et N-2
            }
            //System.out.println("(F"+i+") = "+tab[i]); Test d'affichage pour vérifier l'exactitude du calcul
        }
        //Affichage final
        System.out.println("Le nombre de rang "+nb+" est "+tab[tab.length-1]);
    }
}
