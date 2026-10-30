package sequencials;

//imports-------------------------------------/

import java.util.Scanner;

//main----------------------------------------/


public class CF_to_FCv3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("" +
                "╔═══════════════════════════════════════════════════════════════╗\n" +
                "║ ██     ██ ███████ ██       ██████  ██████  ███    ███ ███████ ║\n" +
                "║ ██     ██ ██      ██      ██      ██    ██ ████  ████ ██      ║\n" +
                "║ ██  █  ██ █████   ██      ██      ██    ██ ██ ████ ██ █████   ║\n" +
                "║ ██ ███ ██ ██      ██      ██      ██    ██ ██  ██  ██ ██      ║\n" +
                "║  ███ ███  ███████ ███████  ██████  ██████  ██      ██ ███████ ║\n" +
                "╠═══════════════════════════════════════════════════════════════╝\n");

        System.out.print("║                       (Y/N)    ºF->ºC: ");
    String decisió = input.next();

    if (decisió.equalsIgnoreCase("Y")){

        System.out.print("║                          Enter ºf: ");
        int ºf = input.nextInt();
        int ºc = (ºf-32)*5/9;
        System.out.print("║                         Resultat: " + ºc + "ºC \n"+
                         "╚═══════════════════════════════════════════════════════════════╝");

    } else if (decisió.equalsIgnoreCase("N")) {

        System.out.print("║                         Enter ºC: ");
        int ºc = input.nextInt();
        int ºF = (ºc * 9 / 5) + 32;
        System.out.print("║                         Resultat: " + ºF + "ºF \n"+
                         "╚═══════════════════════════════════════════════════════════════╝");
    }


    }
}





