package Funcions;

import java.util.Scanner;

public class Funcions_amb_retorn {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        int resultat = sumaDosNumeros(a,b);
        System.out.println(resultat);

        System.out.print("Introdueix IVA: ");
        int IVA = input.nextInt();

        float preu = afagirIVA(resultat, IVA);

        System.out.print("Preu amb IVA: "+ preu);

        System.out.print("n: ");
        int n = input.nextInt();
        boolean tof = esParell(n);
        System.out.print("És parell? "+ tof);

    }
        public static int sumaDosNumeros (int a, int b){
        int s = a + b;
        return s;}

    public static float afagirIVA (float p,float IVA){
       float pIVA= p*(1+IVA/100);
       return  pIVA;
    }
    public static boolean esParell (int n){
        if (n%2==0){
            return true;
        }else{
            return false;

        }
    }
    public static String enMajuscula (String s){
        return s.toUpperCase();
    }
}

