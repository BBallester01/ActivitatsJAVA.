package Condicionals;

import java.util.Scanner;

public class NotaPonderada {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println("Introdueix La Nota Del Trimeste 1: ");
        float n1 = input.nextFloat();

        System.out.println("Introdueix La Nota Del Trimeste 2: ");
        float n2 = input.nextFloat();


        System.out.println("Introdueix La Nota Del Trimeste 3: ");
        float n3 = input.nextFloat();

      float nf = n1*0.2f + n2*0.3f+ n3*0.5f;

      if(nf>=5){

          System.out.println("Ha aprovat amb un " + nf);
      }else{
          System.out.println("Ha suspes amb un " + nf);
      }


    }
}
