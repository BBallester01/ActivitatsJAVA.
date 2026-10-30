package Strings;

public class MString {
    public static void main (String[] args){

        String nom = "Biel";
        System.out.println(nom);

        int n = nom.length();                       // 4 , cuantitat de lletres
        int posO = nom.indexOf('i');                // '1' , posició de o
        int posz = nom.indexOf('z');                // '-1'
        int posDarreraO = nom.lastIndexOf('i'); // '1'  , darrere posició

        char primera = nom.charAt(0);               // 'B'
        char derrera = nom.charAt(nom.length()-1);  // 'l'

        String part1 = nom.substring(1);           // "iel"
        String part2 = nom.substring(0,3);                   // "Bi"
        String junts1 = "Alumne "+ nom;                      // "Alumne Biel"
        String junts2 = nom.concat("Alumne ");           //"BielAlumne "
        String estudis = "Batx";                             //Batx
        String junts3 = nom.concat (estudis);                // "BielBatx"
        String nomMaj = nom.toUpperCase();                   // "BIEL"
        String nommin = nom.toLowerCase();                   // "biel"
        String nom2 = nom.replace('i','l'); //Blel

        boolean començaB = nom.startsWith("B");  // true
        boolean començat = nom.startsWith("t");  // false
        boolean acabatl = nom.startsWith("el");   // true
        boolean acabatL = nom.startsWith("L");   // false

    }
}
