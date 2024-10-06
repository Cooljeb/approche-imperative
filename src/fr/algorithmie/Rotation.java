package fr.algorithmie;

public class Rotation {

    public static void main(String[] args) {
        //Variables

        int[] array = {-1, 12, 17, 14, 5, -9, 0, 18};
        int temp =0; // Variable de stockage temporaire
        int temp2=0;
        int i=1; // compteur


        for (int j = array.length-1; j>=0 ; j--) { // on lit le tableau en commençant par la fin
            /*
            -on est sur le dernier élément, on affecte la valeur à temp et la cellule précédente
            -prend la cellule  actuelle
            - et on décrémente  j, sinon on effectue un switch de valeur la cellule suivante prends
            - la valeur de la cellule précédente et ainsi de suite
            - quand on arrive en début de tableau, on affecte la vakeur de temp à cette cellule
            - le déplacement est ainsi fait
             */
            if(j == array.length-1){
                temp = array[j];
                array[j]=array[j-1];
                j--;
            }else{
                array[j+1] = array[j];
            }

            if (j==0) {
                array[j]=temp;
            }
        }

        //Affichage
        for (int j = 0; j < array.length; j++) {
            System.out.println("array["+j+"] = "+array[j]);
        }
    }
}
