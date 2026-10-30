package Variables;

import java.util.Scanner;

public class DNI2 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);


        System.out.print("\n\n\n\n"+"   Indrodueix el teu nom: ");
      String nom = input.next();

        System.out.print("\n\n\n\n"+"   Indrodueix la teva edad: ");
        int edad = input.nextInt();

        System.out.print("\n\n\n\n"+"   Indrodueix la teva altura: ");
        float altura = input.nextFloat();

        System.out.print("\n\n\n\n"+"   Indrodueix el teu Grup de classe: ");
        char grup = input.next().charAt(0);

        System.out.print("\n\n\n\n"+"   Indrodueix si ets major de edad (true/false): ");
      boolean  major_d_edad = input.nextBoolean();


        System.out.print("\n\n════════════════════════════════ \n"+
                         "\tNOM: " + nom +"\n" +
                         "\tEDAD: "+ edad + "\n" +
                         "\tALTURA: " + altura +"\n" +
                         "\tGRUP: " + grup + "\n" +
                         "\tMAJOR DE EDAD?: " + major_d_edad + "\n" +
                         "════════════════════════════════");
    }
}
