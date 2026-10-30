package Strings;

import java.util.Scanner;

public class Vocals_minuscules {
    static void main() {

        Scanner input = new Scanner (System.in);

        System.out.println("String: ");
        String s = input.next();

int n=0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='A'|| s.charAt(i)== 'a'){
                n++;
            }
            System.out.println("Hi ha " + n  + " as");
        }

    }
}
