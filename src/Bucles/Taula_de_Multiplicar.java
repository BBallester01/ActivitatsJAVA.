package Bucles;

import java.util.Scanner;

public class Taula_de_Multiplicar {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Indtrodueix N: ");
        int n = input.nextInt();

        for (int i=1; i<=10; i++){

            System.out.println("\t" + n + "x" + i + "=" + n * i);
        }
    }
}
