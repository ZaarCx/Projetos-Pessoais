import java.util.Locale;
import java.util.Scanner;

public class ExeCondicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A;
        A = sc.nextInt();

        if (A < 0 ){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }





    }
}
