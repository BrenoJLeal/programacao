import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Televisao tel = new Televisao();
        Smartphone smart = new Smartphone();
        String repetir;
        System.out.println("Cadastro: 1 - Televisão | 2 - Smartphone: ");
        int x = input.nextInt();
        switch (x){
            case 1:
                //Set
                System.out.println("Qual o nome da TV? ");
                tel.setNome(input.next());
                System.out.println("Quantos desses itens exitem no estoque? ");
                tel.setEstoque(input.nextInt());
                System.out.println("Qual o preço desse produto? ");
                tel.setPreco(input.nextDouble());
                //Get
//                System.out.println("O nome do produto é: " + tel.getNome());
//                System.out.println("Quantidade em estoque: " + tel.getEstoque());
//                System.out.println("Qual o valor do produto: " + tel.getPreco());
                break;
            case 2:
                //Set
                System.out.println("Qual o nome do Smartphone? ");
                smart.setNome(input.next());
                System.out.println("Quantos desses itens exitem no estoque? ");
                smart.setEstoque(input.nextInt());
                System.out.println("Qual o preço desse produto? ");
                smart.setPreco(input.nextDouble());
                //Get
//                System.out.println("O nome do produto é: " + smart.getNome());
//                System.out.println("Quantidade em estoque: " + smart.getEstoque());
//                System.out.println("Qual o valor do produto: " + smart.getPreco());
                break;
        }

        do {
        System.out.println("Vendas: 1 - Televisão | 2 - Smartphone: ");
        int z = input.nextInt();

            switch (z){
                case 1:
                    System.out.println("Nós temos a TV: " + tel.getNome() + " quantas você quer? ");
                    tel.setQuantidade(input.nextInt());

                    System.out.println("O nome do produto é: " + tel.getNome());

                    System.out.println("Você comprou: " + tel.getQuantidade());

                    System.out.println("Sobraram no estoque: " + tel.att(tel.getQuantidade()));

                    System.out.println("O valor total de compra é: " + tel.getValor());
                    break;
                case 2:
                    System.out.println("Nós temos o smartphone: " + smart.getNome() + " , quantas você quer? ");
                    smart.setQuantidade(input.nextInt());

                    System.out.println("O nome do produto é: " + smart.getNome());

                    System.out.println("Você comprou: " + smart.getQuantidade());

                    System.out.println("Sobraram no estoque: " + smart.att(smart.getQuantidade()));

                    System.out.println("O valor total de compra é: " + smart.getValor());
                    break;
            }

            System.out.println("Você deseja realizar outra compra? [S/N]");
            repetir = input.next();
        }while(repetir.equalsIgnoreCase("S"));


    }
}