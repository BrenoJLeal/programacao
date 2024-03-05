//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repetir;
        do {
            Estoque estoque = new Estoque();
            System.out.println("Qual o estoque atual? ");
            estoque.setQtoAtual(input.nextInt());

            System.out.println("Qual a quantidade máxima? ");
            estoque.setQtoMax(input.nextInt());

            System.out.println("Qual a quantidade mínima? ");
            estoque.setQtoMin(input.nextInt());

            System.out.println(estoque.getCalcMed());
            System.out.println("Você deseja checar novamente? ");
            repetir = input.next();
        }while (repetir.equalsIgnoreCase("S"));



    }
}