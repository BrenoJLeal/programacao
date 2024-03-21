public class Gerente extends Funcionario{
    private Double calcularBonus;
    public Double getCalcularBonus() {
        return (0.1 * calcularBonus) + calcularBonus;
    }

    public void setCalcularBonus(Double calcularBonus) {
        this.calcularBonus = calcularBonus;
    }
}
