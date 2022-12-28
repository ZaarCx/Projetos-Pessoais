import java.util.Scanner;

public class Funcao {
    private static ControladorBiblioteca controladorBiblioteca = new ControladorBiblioteca();
    // Funções que trabalham juntos com os métodos do controlador da biblioteca.
    public static void criarLivro(Scanner input) {
        System.out.println("Digite o nome do livro!");
        String nomeLivro = input.nextLine();
        System.out.println("Digite o nome do autor!");
        String autor = input.nextLine();
        System.out.println("Digite o ano do livro!!");
        Integer ano = input.nextInt();
        System.out.println("Digite a quantidade total de páginas!");
        Integer numPag = input.nextInt();
        input.nextLine();

        controladorBiblioteca.salvarLivro(nomeLivro, autor, ano, numPag);
    }
    public static void buscarLivro(Scanner input) {
        System.out.println("Digite o nome do livro que deseja buscar!");
        String nome = input.next();
        Livro livro = controladorBiblioteca.lerLivroPorTitulo(nome);
        System.out.println(
                "\nnome do livro: " + livro.getTitulo()
                        + "\nAutor do livro: " + livro.getAutor()
                        + "\nPaginas do livro: " + livro.getNumPaginas()
                        + "\nAno da Publicação: " + livro.getAno());
    }
    public static void atualizarLivro(Scanner input) {
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = input.nextLine();
        System.out.println("Digite o novo nome do autor do livro: ");
        String autor = input.nextLine();
        System.out.println("Digite o novo ano do livro");
        Integer ano = input.nextInt();
        System.out.println("Digite o novo número de páginas do livro");
        Integer numPag = input.nextInt();
        input.nextLine();
        controladorBiblioteca.atualizarLivro(nomeLivro, autor, ano, numPag);
    }
    public static void removerLivro(Scanner input) {
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = input.nextLine();

        controladorBiblioteca.removerLivro(nomeLivro);
    }
}

//Métodos não tem Static, só funções.

//FUNÇÃO VOID :

//Get é para buscar a informação.
//Set é pra setar um novo dado na variável.

