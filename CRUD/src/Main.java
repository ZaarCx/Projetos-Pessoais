import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userDecision;

        do {
            System.out.println("------- Olá Usuário - Bem vindo à nossa Biblioteca!! -------");
            System.out.println("\nDigite a opção que deseja: \n1. Adicionar um livro \n2. Deletar um livro" +
                    "\n3. Atualizar um livro\n4. Ler os dados do livro\n5. Sair da aplicação\n6. Limpar o conteúdo");
            userDecision = sc.nextInt();
            switch (userDecision) {
                case 1: {
                    Livros.addingLiv();
                    break;
                }
                case 2: {
                    Livros.deleteLiv();
                    break;
                }
                case 3: {
                    Livros.updateLiv();
                    break;
                }
                case 4:{
                    Livros.readLiv();
                    break;
                }
                case 6:{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;
                }

            }
        } while (userDecision != 5);



    }
}
