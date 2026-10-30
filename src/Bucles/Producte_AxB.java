package Bucles;

import java.util.Scanner;

public class Producte_AxB {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Indrodueix A: ");
        int a = input.nextInt();

        System.out.println("Indrodueix B: ");
        int b = input.nextInt();

        int i=1;
        int p = 0;

        while (1<a){

            p=p+b;
            i=i+1;

        }
        System.out.println("El producte de " +a + " per " + b + " és: "+ p) ;
    }
}
