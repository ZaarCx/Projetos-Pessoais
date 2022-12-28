import java.util.Locale;
import java.util.Scanner;

public class ExercPeca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


       int p1 = sc.nextInt();
       int np1 = sc.nextInt();
       double n1 = sc.nextDouble();

       int p2 = sc.nextInt();
       int np2 = sc.nextInt();
       double n2 = sc.nextDouble();

       double res = np1 * n1;
       double res2 = np2 * n2;
       double result = res + res2;



       System.out.printf("VALOR A PAGAR: %.2f", result);






    }
}
