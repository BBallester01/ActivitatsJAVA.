package Strings;

import java.util.Scanner;

public class Num_vocals_min {
    static void main() {

        Scanner input = new Scanner (System.in);

        System.out.println("String: ");
        String s = input.next();

        int n=0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='a'|| s.charAt(i)== 'e'||
                    s.charAt(i)=='i'|| s.charAt(i)== 'o'||
                    s.charAt(i)=='u'){
                n++;
            }
            System.out.println("Hi ha " + n  + " vocals minuscules");
        }

    }
}


