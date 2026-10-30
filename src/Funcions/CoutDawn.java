package Funcions;

public class CoutDawn {

    static void main() {
        CD(10);
    }
    public static void CD(int n) {
    if (n==0){
    System.out.println("Booom!");
    }else{
    System.out.print(n + ", ");
    CD(n-1);
    }

    }


}