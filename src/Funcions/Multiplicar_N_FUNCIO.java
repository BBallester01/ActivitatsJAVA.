package Funcions;

import java.util.Scanner;

public class Multiplicar_N_FUNCIO {



    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("-----------------------Enter n: ");
        int n = input.nextInt();
    }

    public static void rMultipicat(int n) {
        for (n = 1; n <= 10; n++) {
            System.out.println("\n TAULA DE MULTIPLICAR DEL " + n);
            for (int i = 1; i <= 10; i++) {

                System.out.println("\t" + n + "x" + i + "=" + n * i);
            }
        }
    }
}