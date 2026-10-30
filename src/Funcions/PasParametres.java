package Funcions;

import java.util.Scanner;

public class PasParametres {

    static void main() {
        int n = 5;
        System.out.println("(m1) N: "+n);
        sumaUn(n);
        System.out.println("(m2) N: "+n);

    }
    public static void sumaUn (int n){
        System.out.println("(F1) N: "+n);
         n=n+1;
        System.out.println("(F1) N: "+n);


    }
}
