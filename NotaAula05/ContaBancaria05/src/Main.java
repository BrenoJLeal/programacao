import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        String r;
        do {
            System.out.println("----- MENU ------");
            System.out.println("Selecione uma opção: 1 - Conta Corrente | 2 - Poupança");
            int x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Digite o nome do titular: ");
                    cc.setTitular(input.next());
                    do {
                        System.out.println("----- CONTA CORRENTE -----");
                        System.out.println("Selecione uma das opções: 1 - Depositar | 2 - Sacar | 3 - Cheque Especial | 4 - Exibir Dados | 5 - Voltar ao Menu Principal");
                        int y = input.nextInt();
                        switch (y) {
                            case 1:
                                //Depositar
                                System.out.println("----- Depositar -----");
                                System.out.println("Quanto você gostaria de depositar ? ");
                                cc.depositar(input.nextDouble());
                                break;
                            case 2:
                                //Sacar
                                System.out.println("----- Sacar -----");
                                System.out.println("Quanto você gostaria de sacar? ");
                                cc.sacar(input.nextDouble());
                                break;
                            case 3:
                                //Cheque Especial
                                System.out.println("----- Cheque Especial -----");
                                System.out.println("Quanto você gostaria de retirar do cheque especial? ");
                                cc.usarEspecial(input.nextDouble());
                                break;
                            case 4:
                                //Exibição de Dados
                                System.out.println("----- Exibir Dados ----- ");
                                System.out.println("Titular: " + cc.getTitular());
                                System.out.println("Saldo Atual: " + cc.getSaldo());
                                System.out.println("Cheque Especial: " + cc.getEspecial());
                                break;
                            case 5:
                                //Voltar ao Menu Principal
                                break;
                        }
                        if (y != 5) {
                            System.out.println("Você deseja voltar ao menu ?");
                            r = input.next();
                        } else {
                            break;
                        }
                    } while (r.equalsIgnoreCase("S"));
                    break;
                case 2:
                    System.out.println("Digite o nome do titular: ");
                    cp.setTitular(input.next());
                    do {
                        System.out.println("----- POUPANÇA -----");
                        System.out.println("Selecione uma das opções: 1 - Depositar | 2 - Sacar | 3 - Selic | 4 - Exibir Dados | 5 - Voltar ao Menu Principal");
                        int z = input.nextInt();
                        switch (z) {
                            case 1:
                                //Depositar
                                System.out.println("----- Depositar -----");
                                System.out.println("Quanto você gostaria de depositar ? ");
                                cp.depositar(input.nextDouble());
                                break;
                            case 2:
                                //Sacar
                                System.out.println("----- Sacar -----");
                                System.out.println("Quanto você gostaria de sacar? ");
                                cp.sacar(input.nextDouble());
                                break;
                            case 3:
                                //Selic
                                System.out.println("----- Selic -----");
                                System.out.println("Taxa selic: ");
                                cp.calcularRendimento(input.nextDouble());
                                break;
                            case 4:
                                //Exibição de Dados
                                System.out.println("----- Exibir Dados ----- ");
                                System.out.println("Titular: " + cp.getTitular());
                                System.out.println("Saldo Atual: " + cp.getSaldo());
                                System.out.println("Taxa Selic: " + cp.getRendimento());
                                break;
                            case 5:
                                //Voltar ao Menu Principal
                                break;
                        }
                        if (z != 5) {
                            System.out.println("Você deseja voltar ao menu ?");
                            r = input.next();
                        } else {
                            break;
                        }
                    } while (r.equalsIgnoreCase("S"));

            }

            System.out.println("Você deseja acessar o menu principal ?");
            r = input.next();
        } while (r.equalsIgnoreCase("S"));
    }
}