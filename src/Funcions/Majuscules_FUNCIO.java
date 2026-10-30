package Funcions;

import java.util.Locale;

public class Majuscules_FUNCIO {

    static void main() {
        String s = "hola";
        System.out.println("(m1) N: "+s);
        Majuscules(s);
        System.out.println("(m2) N: "+s);

    }


    public static void Majuscules(String s){
        System.out.println("S(f1): " +s );
        s = s.toUpperCase();
        System.out.println("S(f2): " +s );
    }
}

