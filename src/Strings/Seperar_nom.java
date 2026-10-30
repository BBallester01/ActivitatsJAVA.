package Strings;

import java.util.Scanner;

public class Seperar_nom {
    static void main() {
        Scanner input = new Scanner ( System.in);

     System.out.print("N0M I LLINATGES: ");
     String nomllinatges =input.nextLine();

     //System.out.println(nomllinatges);
        int espai2 = nomllinatges.lastIndexOf(' ');
       int espai1 = nomllinatges.indexOf(' ');

        String nom = nomllinatges.substring(0,espai1);
        String ll1 = nomllinatges.substring(espai1+1,espai2);
        String ll2 = nomllinatges.substring(espai2+1);

        System.out.printf("Nom: %s%n1r Llinatge: %s%n2n Llinatge: %s", nom,ll1,ll2);

    }
}
