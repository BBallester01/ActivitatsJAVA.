package Recursius;

import java.util.Scanner;

public class MCD {
    static void main() {
    Scanner input = new Scanner (System.in);

         System.out.print("A: ");
         int a = input.nextInt();


        System.out.print("B: ");
        int b = input.nextInt();

        System.out.printf("El MCD %d i %d és %d", a,b, maxComuDivisor(a ,b));
        System.out.printf("El MCD %d i %d és %d", a,b, maxComuDivisorR(a ,b));

    }


    public static int maxComuDivisor (int a,int b){
        int m = minim(a,b);
        while (a%m!=0 || b%m!=0){
         m--;
        }
        return m;
    }
    public static int minim(int a, int b){
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
    public static int maxim(int a, int b){
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static int maxComuDivisorR (int a, int b){
        int maxAB=maxim(a,b);
        int minAB=minim(a,b);
        int restaAB= maxAB % minAB;
        if (restaAB==0){
            return minAB;
        }else {
            return maxComuDivisorR(minAB,restaAB);
        }
    }
}
