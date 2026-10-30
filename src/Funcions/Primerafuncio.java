package Funcions;

public class Primerafuncio {
    static void main() {

        //cridada----------------------------------------------
    imprimirNumeros();
    imprimirNumerosFins(6);
    imprimirNumerosFines(4,3);
    }




    //declaració------------------------------------------------
    public static void imprimirNumeros(){
        for (int i=1; i<=10; i++){System.out.println(i);}
    }
    public static void imprimirNumerosFins(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static void imprimirNumerosFines(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
