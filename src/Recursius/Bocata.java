package Recursius;

public class Bocata {

    static void main() {
        String bocata = "Elsdisposituselectrosnicscomposatsper";
        menjar(bocata);
    }

    public static String mossegar (String b){
       int n = (int) (Math.random()*3+1); //Casting----------------------------------------------casting
        return b.substring(0,n);
    }
    public static boolean esTrabable(String b){
        return b.length() <= 4;
    }

    public static void tragar(String b){
        System.out.print(b);
        System.out.println("  Ñam");
    }
    public static String llevar (String p, String t){
    return p.replaceFirst(t,"");
    }

    public static void menjar (String bocata){
        if(esTrabable(bocata)){
            tragar(bocata);
        }else{
            String boci = mossegar(bocata);
            String resta = llevar(bocata,boci);
            menjar(boci);
            menjar(resta);
        }

    }
}
