public class ContaCorrente extends Conta{
    private double especial = 1000;
    public double getEspecial() {
        return especial;
    }
    public double usarEspecial(double valor){
        if (valor <= especial){
            especial -= valor;
            saldo -= valor;
        }else {
            System.out.println("Saldo de Cheque especial insuficiente");
        }
        return especial;
    }



}
