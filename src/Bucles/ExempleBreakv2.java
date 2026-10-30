package Bucles;
import java.util.Scanner;
public class ExempleBreakv2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        float total = 0;
        int c=0; ;

      while (true) {
          System.out.print("Continuar [S/N]");
          char resposta = input.next().charAt(0);

          if (resposta == 'S' || resposta == 's') {
              System.out.println("Número: ");
              int n = input.nextInt();
              total +=n;
              c++;
          }else {break;}



      }
        System.out.printf("El total és %f", total);
      System.out.printf("                  La mitjana és %f", total/c);
    }
}
