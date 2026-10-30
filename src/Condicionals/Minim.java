package Condicionals;

import java.util.Scanner;

public class Minim {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print(" A: ");
        int a = input.nextInt();
        System.out.print(" B: ");
        int b = input.nextInt();

        if (a>b) {
            System.out.print(" A es menor que B ");
        }else{
            System.out.print(" B es menor que A ");

        }
    }
}
