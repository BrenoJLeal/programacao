public final class Eletronico extends Produtos implements Promocao{

    private double desc;
    public Eletronico(String nome, double preco, TipoProduto tipo){
        super(nome, preco, tipo);
    }
    @Override
    public void promocao(){
        desc = preco * 0.05;
        System.out.println("Seu desconto foi de: " + desc);
        System.out.println("O valor total será: " + (preco + desc));
    }

}
