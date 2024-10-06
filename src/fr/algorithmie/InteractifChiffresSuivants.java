package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {

        //Variables
        Scanner scanner = new Scanner(System.in) ;
        int nb ;
        int cpt = 1; // compteur
        String machaine="";

        System.out.println("Saisir un chiffre svp ? ");
        nb = scanner.nextInt();
        //Affichage
        System.out.println("suite de "+nb+" :" );
        //Concaténation de la châine de caractère "nb+cpt,"
        while (cpt<=10){
            if (cpt<10) {
                machaine += String.valueOf(nb + cpt + ",");
                cpt++;
            }else{// cas du dernier chiffre, on incremente de 1 cpt avant fr concaténer la chaine et la terminer par "."
                cpt++;
                machaine+=String.valueOf(cpt+".");
            }
        }
        System.out.println(machaine);
    }
}
