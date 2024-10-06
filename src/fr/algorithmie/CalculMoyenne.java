package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {

        //variables

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; //tableau
        float moy =0.00F;
        int somme=0;

        //calcul de la somme

        for (int i = 0; i < array.length; i++) {
            somme +=array[i];
        }
        System.out.println("Somme des valeurs du tableau = "+somme +"\n");

        // Cast en Float des variables pour permettre le calcul
        moy = new Float((somme))/ new Float((array.length));
        System.out.println("Moyenne des valeurs du tableau = "+moy);
    }
}
