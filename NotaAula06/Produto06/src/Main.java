//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo Azul");
        Produto produto2 = new Produto("Calça", 99.99,"Calça jeans preta");
        System.out.println("---- CAMISA ----");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Descrição: " + produto1.getDescricao());

        System.out.println("---- CALÇA ----");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        System.out.println("Descrição: " + produto2.getDescricao());

    }
}