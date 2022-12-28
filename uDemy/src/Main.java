import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double x = 3.0;
        Double y = 4.0;
        Double z = -5.0;
        Double A, B, C;
        System.out.println("qual é o seu sexo?");
        Character S = sc.next().charAt(0);

        System.out.println("Seu sexo é:  " + S);
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("raiz quadrada de " + x + " = " + A);
        System.out.println("raiz quadrada de " + y + " = " + B);
        System.out.println("raiz quadrada de 25 = " + C);


        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadraado "  + B);
        System.out.println( " 5 elevado ao quadrado " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);











    }
}