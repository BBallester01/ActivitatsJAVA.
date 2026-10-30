package Condicionals;

import java.util.Scanner;

public class Switch {
    static void main() {

        Scanner input = new Scanner (System.in);

        System.out.print("Grup: ");
        char grup = input.next().charAt(0);

        switch (grup){
            case 'A' | 'a' : System.out.println("Social"); break;
            case 'B' | 'b' : System.out.println("Científic"); break;
            case 'C' | 'c' : System.out.println("Tecnològic"); break;
            default : System.out.println("General");
        }





    }
}
