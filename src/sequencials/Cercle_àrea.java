package sequencials;

//imports-------------------------------------/

import java.util.Scanner;

import static java.lang.Math.PI;

//main----------------------------------------/

public class Cercle_àrea {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("-----------------------Enter Radi: ");
        int r = input.nextInt();

        double area = PI * r * r;

        System.out.print("-----------------------Resultat:   " + area + "   -------------------------");
    }
}