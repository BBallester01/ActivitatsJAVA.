package Condicionals;

import java.util.Scanner;

public class Equacions {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print(" A: ");
        int a = input.nextInt();
        System.out.print(" B: ");
        int b = input.nextInt();
        System.out.print(" C: ");
        int c = input.nextInt();

        int D = b*b-4*a*c;
    if (D<0) {
        System.out.print("\n No té solició");


    }else{
        if (D == 0){

            float Xo = -b/(2*a);
            System.out.print("Té una solució: " + Xo);


        }else{
            double X1 = ( -b + Math.sqrt (D)) /(2*a);
            double X2 = ( -b - Math.sqrt (D)) /(2*a);
            System.out.print("Té dos solucions: " + "\n" + X1 + "\n" + X2 );
        }
    }


    }
}
