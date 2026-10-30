package Funcions;

import java.util.Scanner;

public class Area_Rectangle_FUNCIO {

    static void main() {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("Enter b:");
        int b = input.nextInt();

        System.out.printf("L'area del rectagle és %d", aRectagle(a, b));
    }
    public static int aRectagle(int a, int b) {
        return a * b;
    }
}