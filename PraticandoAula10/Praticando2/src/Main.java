//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Harry Potter", 20.00, TipoProduto.LIVRO);
        Eletronico el = new Eletronico("Ipod", 2000.00, TipoProduto.ELETRONICO);
        Roupa r = new Roupa("Camisa", 30.00, TipoProduto.ROUPA);
        System.out.println("---- Livro ----");
        System.out.println(l);
        l.promocao();

        System.out.println("---- Eletrônico ----");
        System.out.println(el);
        el.promocao();

        System.out.println("---- Roupa ----");
        System.out.println(r);


    }
}