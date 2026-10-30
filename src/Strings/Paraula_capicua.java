package Strings;

import java.util.Scanner;

public class Paraula_capicua {
    static void main() {

        Scanner input = new Scanner (System.in);

        System.out.println("String: ");
        String s = input.next();

        boolean capicua= true;

        for(int i = 0; i <s.length()/2; i ++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                capicua = false;

            }
        }

        System.out.println("És capicua? "+ capicua);



    }
}
