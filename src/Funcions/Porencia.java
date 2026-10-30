package Funcions;

import java.util.Scanner;

public class Porencia {

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        int b = input.nextInt();
        System.out.print("Exponent: ");
        int e = input.nextInt();


        System.out.println(potR(b,e));
        System.out.println(potR2(b,e));
    }
    public static int potR (int b, int e){
        if (e==0){
            return 1;
        }else{

            e--;
          b= b*potR(b,e);
            return b;
        }
    }

    public static int potR2 (int b, int e){
        if (e==0){
            return 1;
        }else if (e%2==0){
            return potR2(b,e/2)*potR2(b, e/2);
        }else{
            return potR2(b,e/2)*potR2(b, e/2)*b;
        }
    }
}
