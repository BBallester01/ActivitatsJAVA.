package Strings;

import java.util.Scanner;

public class Pasword_igual {
    static void main() {

        Scanner input = new Scanner (System.in);

        System.out.println("Contrasenya 1: ");
        String v1 = input.next();

        System.out.println("Contrasenya 2: ");
        String v2 = input.next();



        if (v1.equals(v2)){ //no == , ya que no funciona amb STRINGS (objectes)

            System.out.println("Contrasenya iguals");
        }else{
            System.out.println("Contrasenya no igual");

        }
    }
}
