public class Eletronico extends Produtos implements Promocao{
    private double desc;

    public Eletronico(String nome, double preco, TipoProduto tipo) {
        super(nome, preco, tipo);
    }

    @Override
    public void promocao(){
        desc = preco * 0.05;
        System.out.println("Desconto : " + desc);
        System.out.println("Valor final: " + (preco + desc));
    }


}
