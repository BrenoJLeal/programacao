public abstract class Produtos {
    protected String nome;
    protected double preco;


    public Produtos(String nome, double preco, TipoProduto tipo){
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
    }
    private final TipoProduto tipo;

    public TipoProduto getTipo() {

        return tipo;
    }
    @Override
    public String toString() {
        return "Produtos: " +
                "nome = '" + nome + '\'' +
                ", preço = " + preco +
                ", tipo = " + tipo;

    }
}


