//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produtos l1 = new Livro("Harry Potter", 20.00, TipoProduto.LIVRO);
        Livro l2 = new Livro ("As Crônicas de Nárnia", 20.00, TipoProduto.LIVRO);
        Produtos el1 = new Eletronico("Ipod", 2000.00, TipoProduto.ELETRONICO);
        Eletronico el2 = new Eletronico("Iphone", 5000.00, TipoProduto.ELETRONICO);
        Produtos r1 = new Roupa("Camisa", 30.00, TipoProduto.ROUPA);
        Transformacao t = new Transformacao();

        System.out.println("---- Lista de Livros ----");
        System.out.println("Exemplo 1: Harry Potter");
        System.out.println(l1);
        ((Livro)l1).promocao();

        System.out.println("\nExemplo 2: As Crônicas de Nárnia ");
        System.out.println("Primeira forma: ");
        t.desconto(l2);
        System.out.println("\n Segunda forma: ");
        t.desconto(new Livro ("As Crônicas de Nárnia", 20.00, TipoProduto.LIVRO));

        System.out.println("\n---- Eletrônico ----");
        System.out.println("Exemplo 1: Ipod");
        System.out.println(el1);
        ((Eletronico)el1).promocao();

        System.out.println("\nExemplo 2: Iphone");
        System.out.println("Primeira forma: ");
        t.desconto(el2);
        System.out.println("\nSegunda forma:");
        t.desconto(new Eletronico("Iphone", 5000.00, TipoProduto.ELETRONICO));
        System.out.println("\n---- Roupa ----");

        System.out.println("\nExemplo 1: Camisa");
        System.out.println(r1);




    }
}