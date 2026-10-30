package Strings;

import java.util.Scanner;

public class Email_comprovar {
    static void main() {
        Scanner input = new Scanner ( System.in);

     System.out.print("Email: ");
     String email =input.nextLine();

     //System.out.println(nomllinatges);
        int pAt = email.lastIndexOf('@');
       int pDot = email.indexOf('.');
       int llarg = email.length();

        char l1 = email.charAt(0);

                int nom = pAt;
                int domini = pDot - pAt-1;
                int extencio = llarg - pDot-1;



            System.out.print("El Email ");
       if (pAt!=-1 && pDot!=-1 &&email.length()>3 && domini>=3 && (extencio==2 || extencio==3 && Character.isLetter(l1))){

           System.out.print("Valid");
       }else{

           System.out.print("NO és vailid");
       }

    }
}
