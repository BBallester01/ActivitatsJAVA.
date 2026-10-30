package Bucles;

public class Print_1_TO_100 {
    public static void main(String[] args) {

        //ACT 14- Imprimir els números de l'1 al 100

        //FOR

        for (int i = 1; i <= 100; i = i + 1) {

            System.out.println(i);

        }
        System.out.println();

        //while

        int j = 1;

        while (j <= 100) {
            System.out.println(j);
            j = j + 1;

        }
        System.out.println();

        //do-while
        int k = 1;
        do{
            System.out.println(k);
            k = k + 1;
        }while(k<=100);

    }
}