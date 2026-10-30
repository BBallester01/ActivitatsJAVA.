package Condicionals;

import java.util.Scanner;

public class OperadorCondicional {

    static void main() {

        Scanner input= new Scanner (System.in);

        System.out.println("Edad: ");
        int edad = input.nextInt();

        String m = (edad>=18)? "Major d'edad" : "Menor d'edad" ;

        System.out.print("Ets "+ m);
    }
}
