//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String repetir;
        Scanner input = new Scanner(System.in);
        Custo custo = new Custo();
        do {


            System.out.println("Você gostaria de comprar quantas maçãs?");
            custo.setFruta(input.nextInt());

            System.out.println("Você deseja comprar mais? ");
            repetir = input.next();
        }while(repetir.equalsIgnoreCase("S"));

        System.out.println("Você comprou: " + custo.getFruta() + " maçãs");
        System.out.println("R$ " + custo.getValor());
    }
}