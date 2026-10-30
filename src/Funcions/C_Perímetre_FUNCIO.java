package Funcions;

//imports-------------------------------------/

import java.util.Scanner;


//main----------------------------------------/

public class C_Perímetre_FUNCIO {



    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("-----------------------Enter a: ");
        int a = input.nextInt();
        System.out.print("-----------------------Enter b: ");
        int b = input.nextInt();

        int resultat = PerimetreC(a,b);
        System.out.print("-----------------------Resultat:   " + resultat + "   -------------------------");


    }

    public static int PerimetreC (int a, int b) {

        int Perímetre = 2 * a + 2 * b;
        return Perímetre;
    }}