package controladores;

import entidades.Livro;

import java.util.HashMap;
import java.util.Map;

public class ControladorLivro {

    private Map<Integer, Livro> livros = new HashMap<>();

    public void salvarLivro(String titulo, String genero, Integer ano, Integer numeroPag, String nome, Integer idade, Integer qtLivros, int id){

        Livro l = new Livro(titulo, genero, ano, numeroPag, nome, idade, qtLivros);
        livros.put(l.getId(), l );
    }

    public Livro lerLivroPorTitulo(int id){

           Livro livro =  livros.get(id);
           return livro;

    }

    public Livro atualizarLivro(String genero,  Integer numeroPag, int id){
        if(livros.containsKey(id)){
            Livro livro = livros.get(id);
            livro.setGenero(genero);
            livro.setNumPaginas(numeroPag);
            return livro;
        }
        else{
            System.out.println("Não foi encontrado nenhum livro com esse título!");
            return null;
        }
    }

    public Livro removerLivro (int id){
        if (livros.containsKey(id)){
           Livro livro = livros.remove(id);
            System.out.println("Seu livro foi removido");
            return livro;
        }else {
            System.out.println("Não foi encontrado nenhum livro!");
            return null;
        }

    }

}
