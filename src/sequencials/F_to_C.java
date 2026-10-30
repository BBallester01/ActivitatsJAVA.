package sequencials;


//imports-------------------------------------/


import java.util.Scanner;




//main----------------------------------------/


public class F_to_C {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);


        System.out.print("-----------------------Enter ºf: ");
        int ºf = input.nextInt();


        int ºc = (ºf-32)*5/9;


        System.out.print("-----------------------Resultat:   " + ºc + "   -------------------------");
    }
}
