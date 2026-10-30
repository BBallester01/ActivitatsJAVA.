package Strings;

import java.util.Scanner;

public class Lletre_p_Lletre_reves {
    static void main() {

        Scanner input = new Scanner (System.in);

        System.out.println("String: ");
        String s = input.next();

       int n = s.length();

        for(int i=n-1;i>=0;i--){
            System.out.println("String | REVES | Lletre "+ i + " de " + n + " : " +  s.charAt(i));
        }

    }
}
