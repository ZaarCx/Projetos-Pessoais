import java.util.Locale;
import java.util.Scanner;

public class ExercDif2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A,B,C,D, Dif;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        Dif = (A*B - C*D);

        System.out.println("DIFERENCA = " +  Dif);


    }
}
