public class Conta {
    protected String titular;
    protected double saldo = 0;

    public double getSaldo() {
        return saldo;
    }

    protected double depositar;
    protected double sacar;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public double sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }
}
