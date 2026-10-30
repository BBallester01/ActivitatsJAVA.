package Condicionals;

import java.util.Scanner;

public class Màxim {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print(" A: ");
        int a = input.nextInt();
        System.out.print(" B: ");
        int b = input.nextInt();

        if (a<b) {
            System.out.print(" A es major que B ");
        }else{
            System.out.print(" B es major que A ");

        }
    }
}
