package Condicionals;

import java.util.Scanner;

public class Entrades_cine {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print(" Introdueix el nombre de persones: ");
        int NumP = input.nextInt();

        System.out.print("El preu TOTAL és: ");
        if (NumP<5){
            int preu = 5;

            int PreuF = preu * NumP;
            System.out.print(PreuF);

        }else {

            if (NumP < 9) {
                int preu = 4;

                int PreuF = preu * NumP;
                System.out.print(PreuF);

            } else {
                int preu = 3;

                int PreuF = preu * NumP;
                System.out.print(PreuF);
            }

        }


    }
}
