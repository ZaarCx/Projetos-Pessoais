import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println(" q horas?");
        hora = sc.nextInt();


        if (hora < 6) {
            System.out.println("boa madrugada!");
        } else if (hora < 12) {
            System.out.println("bom dia!");
        } else if (hora < 18 ) {
            System.out.println("boa tarde!");
        } else if (hora < 24){
            System.out.println("boa noite!");
        } else {
            System.out.println("você está dormindo");
        }

    }
}
