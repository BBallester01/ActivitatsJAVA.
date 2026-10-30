package Funcions;

//imports-------------------------------------/

import java.util.Scanner;

import static java.lang.Math.PI;


//main----------------------------------------/

public class C_àrea_FUNCIO {

    public static double AreaC (int a) {
        Scanner input = new Scanner(System.in);


        System.out.print("-----------------------Enter Radi: ");
        int r = input.nextInt();

        double area = PI * r * r;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("-----------------------Enter a: ");
        int a = input.nextInt();

        double resultat = AreaC(a);

        System.out.print("-----------------------Resultat:   " + resultat + "   -------------------------");



    }
}