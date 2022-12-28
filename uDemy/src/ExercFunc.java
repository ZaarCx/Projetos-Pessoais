import java.util.Locale;
import java.util.Scanner;

public class ExercFunc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer Func = sc.nextInt();
        Integer Hora = sc.nextInt();
        Double SalHora = sc.nextDouble();
        Double salario = Hora * SalHora;

        System.out.println("NUMBER = " + Func);
        System.out.println("SALARY = " + salario);


    }
}
