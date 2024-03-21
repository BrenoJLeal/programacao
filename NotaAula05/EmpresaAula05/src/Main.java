import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        System.out.println("Qual o seu departamento? ");
        gerente.setDepartamento(input.next());

        System.out.println("Qual o seu salário? ");
        gerente.setCalcularBonus(input.nextDouble());

        System.out.println("Quantas ações o Diretor possui? ");
        diretor.setAcoes(input.nextInt());

        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("Salário do Gerente: " + gerente.getCalcularBonus());
        System.out.println("Ações do Diretor: " + diretor.getAcoes());
    }
}