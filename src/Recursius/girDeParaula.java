package Recursius;

public class girDeParaula {


    static void main() {
        System.out.printf("%s al reves és %s", "hola" , girar("hola"));
    }
    public static String girar (String p){

        if (p.length()==1){
            return p;
        }else {
            char primera =p.charAt(0);
            String resta = p.substring(1);
            return girar(resta)+primera;
        }
    }
}
//NUMEROS DE As EN UN STRING(Funcio normal y recursiva)