package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in) ;
        int [] tnb = new int [10]; // déclaration d'un tableau de taille 10 comprenant des int
        int nb=0 ;
        int cpt=0; //compteur
        int max=0; //Maximum
        System.out.println("Saisir 10 nombres (au hasard) : ");

        //Remplissage du tableau
        for (cpt=0 ; cpt<tnb.length ; cpt++) {
            System.out.println("Saisie n°"+(cpt+1));
            nb = scanner.nextInt();
            tnb[cpt]=nb;
        }
        //Récupération de la plus grande valeur du tableau

        cpt=1; // on réutilise cpt, du coup on l'initialise à 1 car
        max=tnb[0]; // par défaut on affecte la valeur max à la première entrée du tableau

        while(cpt<tnb.length){
            if(tnb[cpt]>max){
                max=tnb[cpt];
                cpt++;
            }else{
                cpt++;
            }
        }
        System.out.println("Le plus grand nombre saisi est : " +max);
    }
}
