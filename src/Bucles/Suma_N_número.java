package Bucles;

import java.util.Scanner;

public class Suma_N_número {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int I = 0;
        int Suma = 0;

        System.out.print("\n\n\n\n" + "   Indrodueix el nombre de Números a sumar: ");
        int nombreSumes = input.nextInt();

        while (I<nombreSumes) {

            System.out.print("\n" + "   Indrodueix els Numero (De un en un): ");
            int Num = input.nextInt();
            Suma = Suma + Num;
            I++;

        }
            System.out.print("\n\n\n\n"+ "   ═══════════════════════════════════════════════" + "\n      El resultat és: " + Suma + "\n   ═══════════════════════════════════════════════");

  }
}
