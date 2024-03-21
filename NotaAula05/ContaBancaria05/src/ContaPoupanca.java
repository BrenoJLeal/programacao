public class ContaPoupanca extends Conta{

    private double rendimento;

    public double getRendimento() {
        return rendimento;
    }
    public double calcularRendimento(double selic){
        if (selic > 8.5){
            rendimento = 0.005 * saldo;

        }else{
            rendimento = 0.007 * selic * saldo;
        }
        return rendimento;
    }
}
