//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Harry Potter", 50.00, TipoProduto.LIVRARIA) ;
        Eletronico el = new Eletronico("IphoneX", 9000.00, TipoProduto.ELETRÔNICO);
        Roupa r = new Roupa("Camisa", 40.00, TipoProduto.VESTUÁRIO);

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