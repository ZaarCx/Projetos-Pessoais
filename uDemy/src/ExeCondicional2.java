import java.util.Locale;
import java.util.Scanner;

public class ExeCondicional2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a*b);

        if (a % b == 0 || b % a == 0) {
            System.out.println("são multiplos");
        } else {
            System.out.println("não são multiplos");
        }

    }
}
