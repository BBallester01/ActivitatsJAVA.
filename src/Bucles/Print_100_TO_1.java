package Bucles;

public class Print_100_TO_1 {
    public static void main(String[] args) {

        //ACT 14- Imprimir els números de l'1 al 100

        //FOR

        for (int i = 100; i >= 1; i = i - 1) {

            System.out.println(i);

        }
        System.out.println();

        //while

        int j = 100;

        while (j >= 1) {
            System.out.println(j);
            j = j - 1;

        }
        System.out.println();

        //do-while
        int k = 100;
        do{
            System.out.println(k);
            k = k - 1;
        }while(k>=1);

    }
}