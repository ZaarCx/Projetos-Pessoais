public class ContaBancaria {

    private String nome;
    private static Integer quantidade = 0;
    private String end;
    private Integer agencia = 0;
    private Integer conta = 1000;


    public ContaBancaria(String nome, String endereco) {
        this.nome = nome;
        this.end = endereco;
        this.quantidade += 1;
        this.conta += 1;
    }


    public String getInfoConta() {
        return String.format("O Número da conta é: %d %d\nA agência está localizada em: %s\nEssa conta é de: %s\nA conta foi a conta Nº: %d",
                this.conta, this.agencia, this.end, this.nome, this.quantidade);
    }

}
