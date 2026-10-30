package Condicionals;

import java.util.Scanner;

public class Discoteca {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print(" Introdueix la teva edad: ");
        int AGE = input.nextInt();

        if (AGE<18){
            System.out.println(" Els menors de edad no tenen permesa la entrada");

        }else{
            System.out.println(" Benvigut al Coco Loco");
        }
    }
}
