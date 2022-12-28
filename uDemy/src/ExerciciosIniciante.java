import java.util.Locale;
import java.util.Scanner;

public class ExerciciosIniciante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double larg = sc.nextDouble();
        double comp = sc.nextDouble();
        double metroQ = sc.nextDouble();

        double area = larg * comp;
        double preco = area * metroQ;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);










    }
}
