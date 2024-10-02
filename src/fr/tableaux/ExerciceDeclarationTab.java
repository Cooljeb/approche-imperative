package fr.tableaux;

public class ExerciceDeclarationTab {

    public static void main(String[] args) {

        int tabInt [] = {8,-7,12,1,-2,14,17,9};

        //Affichez l’élément du tableau d’index 0 du tableau
        System.out.println(tabInt[0]);

        //Affichez la longueur du tableau
        System.out.println(tabInt.length);

        //Affichez l’entier positionné au dernier index du tableau
        System.out.println(tabInt[tabInt.length - 1]);

        //Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans
        //votre code pour l’expliquer.

        System.out.println(tabInt[10]); // cela échoue, l'index tabInt[10] n'existe pas l'index max = tabInt.length-1
        // l'IDE l'indique par le message => Index 10 out of bounds for length 8

    }
}
