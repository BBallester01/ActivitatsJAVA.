package Bucles;



public class Taula_de_Multiplicar_V2 {
    public static void main(String[] args) {


        for (int n=1; n<=10; n++) {
            System.out.println("\n TAULA DE MULTIPLICAR DEL "+n);
            for (int i = 1; i <= 10; i++) {

                System.out.println("\t" + n + "x" + i + "=" + n * i);
            }
        }
    }
}
