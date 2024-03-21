//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Aluno

        Aluno aluno = new Aluno("Breno", 50101, 26);

        //Professor
        Professor p = new Professor("Paulo",55,5555);

        System.out.println("---- Aluno ----");
        System.out.println("Nome do Aluno:" + aluno.getNome());
        System.out.println("Matricula:" + aluno.getMat());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("---- Professor ----");
        System.out.println("Nome do Professor: " + p.getNome());
        System.out.println("Salario: " + p.getSalario());
        System.out.println("Idade: " + p.getIdade());

    }
}