package sequencials;


//imports-------------------------------------/


import java.util.Scanner;




//main----------------------------------------/


public class C_to_F {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);


        System.out.print("-----------------------Enter ºC: ");
        int ºc = input.nextInt();


        int ºF = (ºc * 9 / 5) + 32;


        System.out.print("-----------------------Resultat:   " + ºF + "   -------------------------");
    }
}
