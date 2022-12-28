import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Loop do menu, precisa escolher de acordo com as opções do meu se não ficará repetindo até
        //Escolher uma opção dentro do laço de repetição.


        do {
            mostrarMenu();

        } while (escolherOpcao(input));
    }

    public static void mostrarMenu() {
        System.out.println("------------------ BEM VINDO AO SISTEMA DE BIBLIOTECAS ------------------");
        System.out.println("------------------ ESCOLHA UMA DAS OPÇÕES : ");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - BUSCAR");
        System.out.println("3 - ATUALIZAR");
        System.out.println("4 - REMOVER");
        System.out.println("5 - SAIR");
    }

    public static boolean escolherOpcao(Scanner input) {

        //Enquanto eu digitar de 1 a 5 será true, caso eu digite algo fora disso dará false e repetirá o loop.
        //Estrutura de repetição/Loop

        int opcao = input.nextInt();
        input.nextLine();
        boolean naoFinalizou = true;


        switch (opcao) {
            case 1:
                Funcao.criarLivro(input);
                break;
            case 2:
                Funcao.buscarLivro(input);
                break;
            case 3:
                Funcao.atualizarLivro(input);
                break;
            case 4:
                Funcao.removerLivro(input);
                break;
            case 5:
                naoFinalizou = false;
                System.out.println("Você saiu da biblioteca!");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
        return naoFinalizou;
    }
}
