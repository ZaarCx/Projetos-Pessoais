import java.util.Locale;
import java.util.Scanner;

public class ExeCondicional1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X;
        X = sc.nextInt();

        if (X % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

    }
}
