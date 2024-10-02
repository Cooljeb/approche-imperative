package fr.tableaux;

public class ExerciceTableauChaines {

    public static void main(String[] args) {
        //Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.
        String tabVilles [] = {"Nantes","Paris","Marseille","Lyon","Beauvais"};

        //Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.
        System.out.println("Voici le tableau des Villes : \n "+tabVilles[0] +" \n"+ tabVilles[1]+" \n"+tabVilles[2]+" \n"+tabVilles[3]+" \n"+tabVilles[4] );

        //Affichez la longueur du tableau
        System.out.println("\nLongueur du tableau tabVilles ==> "+tabVilles.length);

        //Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
        tabVilles[2] = "Reims";

        //Affichez les 5 éléments du tableau après modification
        System.out.println("\nVoici le tableau des Villes :\n"+tabVilles[0] +" \n"+ tabVilles[1]+" \n"+tabVilles[2]+" \n"+tabVilles[3]+" \n"+tabVilles[4] );

         /*Dans le cours suivant, nous allons voir une méthode plus pratique et plus systématique
        pour afficher tous les éléments d’un tableau (avec une boucle).*/
        System.out.println("\n *** Dans le cours suivant, nous allons voir une méthode plus pratique et plus systématique"
                + "\n pour afficher tous les éléments d’un tableau (avec une boucle)*** \n");
        for (int i = 0; i < tabVilles.length ; i++) {
            System.out.println( "Index "+i+ " ==> la ville est " +tabVilles[i]+ "\n" );
        }

    }
}
