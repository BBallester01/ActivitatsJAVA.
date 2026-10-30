package Recursius;

public class producteR {

    static void main() {
        System.out.printf("El producte de %d per %d es %d%n", 4,3,producte(4,3) );
        System.out.printf("El producte de %d per %d es %d%n", 4,3,productR(4,3) );

    }
    public static int producte(int a, int b){
        int p = 0;
        while (b>=1){
            p=p+a;
           b--;
        }
            return p;

    }

    public static int productR(int a, int b){

       if (b == 1){return a;}

       else{ return a +productR(a,b-1);}


    }
}
