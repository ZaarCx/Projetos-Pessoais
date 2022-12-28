import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x,y,resultado_parcial,Final,total;

        x = sc.nextInt();
        y = sc.nextInt();

        total = y/2;
        resultado_parcial = y + x;
        Final = total * resultado_parcial;

        System.out.println("o resultado final é: " + Final);



    }
}
