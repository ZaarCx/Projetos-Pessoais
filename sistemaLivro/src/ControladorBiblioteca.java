import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class ControladorBiblioteca {

    //HashMap é um conjunto de pares de chaves/valor, para cada elemento contém um valor salvo no HashMap,
    // deve existir uma chave "titulo" unica atrelada a ele, os elementos no HashMap deve ser acessado por suas chaves.
    //Map é uma interface, Hashmap é uma implementação dessa interface.

    private Map<String, Livro> livros = new HashMap<>();
    //private é o modificador de acesso
    //Map é o tipo do atributo onde se passam a Key e os Valores
    //livros é o atributo
    //new HashMap é uma instancia do MAP

    //Método para salvar o livro
    // ContainsKey serve para verificar se uma chave especifica está sendo mapeada ou não
    // ele pega o elemento chave como parâmetro e retorna true se o elemento estiver mapeado no mapa;

    public void salvarLivro(String titulo, String autor, Integer ano, Integer numPaginas){
        if (!livros.containsKey(titulo)){
            livros.put(titulo, new Livro(titulo,autor,ano,numPaginas));
        } else {
            System.out.println("Já existe um livro com esse título!");
        }
    }
    //Método para ler o livro pelo titulo
    public Livro lerLivroPorTitulo(String titulo){
        return livros.get(titulo);
    }


    //Método para atualizar o livro pelo titulo
    public Livro atualizarLivro(String titulo, String autor, Integer ano, Integer numPaginas){
        if (livros.containsKey(titulo)){
            Livro livro = livros.get(titulo);
            livro.setAutor(autor);
            livro.setAno(ano);
            livro.setNumPaginas(numPaginas);
            return livro;
        } else {
            System.out.println("Não foram encontrados livros com esse título!");
            return null;
        }
    }
    //Método para remover o livro pelo título
    public Livro removerLivro(String titulo){
            if (livros.containsKey(titulo)){    //Desvio Condicional
            Livro livro = livros.remove(titulo);
            System.out.println("Seu livro foi removido!");
            return livro;
        } else {
            System.out.println("Não foram encontrados livros com esse titulo!");
            return  null;
        }
    }
}
