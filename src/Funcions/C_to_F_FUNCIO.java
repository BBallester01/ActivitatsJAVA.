package Funcions;

import java.util.Scanner;

public class C_to_F_FUNCIO {

    static void main() {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter Cº:");
        float c = input.nextFloat();

        System.out.printf("La temperatura en Fº és %f", C_t_F(c));
    }
    public static float C_t_F (float c ) {
        return c * 9/5  + 32;
    }
}