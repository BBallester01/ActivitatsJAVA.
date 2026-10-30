package Bucles;

import java.util.Scanner;

public class Quant_Numeros {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int numPars = 0, numImpars = 0;
        int numPos = 0, numNeg = 0;

        for (int i=1;i<=10; i++) {
            System.out.print("Númerto "+ i + ": ");
            int n = input.nextInt();

            if( n>=0){
                numPos++;
            }else{
                numNeg++;
            }


            if (n%2==0){
                numPars++;
            }else{
                numImpars++;
            }
        }

        System.out.print(
                "═══════════════════════════════════════════════|" +
                "\n \t Hi Ha: \n "+ "\t" +
                numPars + " Nombres Pars \n" + "\t" +
                numImpars + " Nombres Impars\n" +"\t" +
                numPos + " Nombres Positius\n" + "\t" +
                numNeg + " Nombres Negatius" + "\n"+
                "═══════════════════════════════════════════════" );

    }
}
