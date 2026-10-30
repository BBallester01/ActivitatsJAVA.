package Strings;

import java.util.Scanner;

public class Pasword_igual_no_equals {
    static void main() {

        Scanner input = new Scanner (System.in);

        System.out.println("Contrasenya 1: ");
        String v1 = input.next();

        System.out.println("Contrasenya 2: ");
        String v2 = input.next();

        boolean iguals = true;

     if (v1.length()!=v2.length()){
         iguals = false;

     }else {
         for (int i=0; i<v1.length() ;i++){
             if (v1.charAt(i)!=v2.charAt(i)) {

                 iguals = false;
             }else{
                 iguals = true;

             }

         }


     }
     if(iguals = false){

         System.out.println("Contrasenya no iguals");
     }else{
         System.out.println("Contrasenya iguals");

     }
    }
}
