//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repetir;
        do {
            Triangulos triangulos = new Triangulos();
            System.out.println("Qual o valor do primeiro lado? ");
            triangulos.setL1(input.nextDouble());
            System.out.println("Qual o valor do segundo lado? ");
            triangulos.setL2(input.nextDouble());
            System.out.println("Qual o valor do terceiro lado? ");
            triangulos.setL3(input.nextDouble());

            System.out.println("Esse é um triângulo " + triangulos.getResult());

            System.out.println("Você deseja tentar novamente ? [S/N] ");
            repetir = input.next();
        }while(repetir.equalsIgnoreCase("S"));
    }
}