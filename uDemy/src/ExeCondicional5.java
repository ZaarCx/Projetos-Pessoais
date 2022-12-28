import java.util.Locale;
import java.util.Scanner;

public class ExeCondicional5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if(num < 0.0 || num > 100.0){
            System.out.println("fora de intervalo");
        } else if ( num <= 25){
            System.out.println("Intervalo [0,25]");
        } else if ( num <= 50) {
            System.out.println("intervalo [25,50]");
        } else if ( num <= 75){
            System.out.println("Intervalo [50,75]");
        } else if( num <= 100){
            System.out.println("Intervalo [75,100]");
        }


    }
}
