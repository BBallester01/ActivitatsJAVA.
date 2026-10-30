package Recursius;

public class Numero_A {


    static void main() {
        System.out.printf("%s te %d de 'a's ", "ala" , numA("ala"));
    }

    public static int numA(String p){
        int n=0; int llarg = p.length();

        for (int i=0; i<llarg;i++) {
            if (p.charAt(0) == 'a') {
                n++;

            }
        }
        return n;
    }

}
//NUMEROS DE As EN UN STRING(Funcio normal y recursiva)