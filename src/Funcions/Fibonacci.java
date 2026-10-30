package Funcions;

public class Fibonacci {

    static void main() {
        System.out.printf("Fibonacci de %d es %d", 7, fiboF(7));

    }

    public static int fiboF(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fiboF(n - 2) + fiboF(n - 1);
        }


    }

}