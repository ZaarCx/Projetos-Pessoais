 class Liv {
    String nome;
     String autor;
     String categoria;
     int LivID;




    public int getLivID() {
        return LivID;
    }

    public void setLivID(int livID) {
        LivID = livID;
    }

    public String nome(){
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Liv (String nomeL, int LiveIDL, String autorL, String categoriaL  ) {

        nome = nomeL;
        LivID = LiveIDL;
        categoria = categoriaL;
        autor = autorL;

    }

    public String toString(){
        return " ------------------\nID do livro: " + LivID + "\nnome do livro: " + nome + "\nautor: " + autor + "\ncategoria: " + categoria + "\n ---------";
    }
}
