public abstract class Produtos {
    protected String nome;
    protected double preco;


    public Produtos(String nome, double preco, TipoProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;

    }
    private final TipoProduto tipo;

    public TipoProduto getTipo(){
        return tipo;
    }

    @Override
    public String toString() {
        return "Produto " +
                "nome = '" + nome + '\'' +
                ", preço = " + preco +
                ", tipo = " + tipo;

    }

}
