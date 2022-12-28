import java.util.Locale;
import java.util.Scanner;

public class ExeCondicional7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a;
        a = sc.nextDouble();
        double imposto;


        if(a <= 2000.00){
            imposto = 0.0;
        }
        else if (a <= 3000.00){
            imposto = (a - 2000.00) * 0.08;
        }
        else if(a <= 4500.00){
            imposto = (a - 3000.00) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (a - 4500.0) * 0.28 + 1500.00 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0){
            System.out.println("isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

    }

}
