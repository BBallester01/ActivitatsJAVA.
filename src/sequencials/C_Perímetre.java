package sequencials;

//imports-------------------------------------/

import java.util.Scanner;


//main----------------------------------------/

public class C_Perímetre {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("-----------------------Enter a: ");
        int a = input.nextInt();
        System.out.print("-----------------------Enter b: ");
        int b = input.nextInt();

        int Perímetre = 2 * a + 2 * b;

        System.out.print("-----------------------Resultat:   " + Perímetre + "   -------------------------");
    }
}