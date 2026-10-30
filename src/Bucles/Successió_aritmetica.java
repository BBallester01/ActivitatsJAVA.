package Bucles;

import java.util.Scanner;

public class Successió_aritmetica {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix n: ");
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            int x = 2*i-1;
            System.out.println("X" + i + ": " + x );
        }
    }
}
