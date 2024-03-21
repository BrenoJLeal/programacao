public class Produto {
    protected String nome;
    protected int estoque;

    protected Double preco;
    protected Double valor;
    protected int quantidade;

    public int att(int b){
        estoque = estoque - b;
        return estoque;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor = preco * quantidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
