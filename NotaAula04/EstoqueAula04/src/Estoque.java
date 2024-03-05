public class Estoque {
    private int qtoAtual;
    private int qtoMax;
    private int qtoMin;
    private int calcMed;

    public int getQtoAtual() {
        return qtoAtual;
    }

    public void setQtoAtual(int qtoAtual) {
        this.qtoAtual = qtoAtual;
    }


    public void setQtoMax(int qtoMax) {
        this.qtoMax = qtoMax;
    }

    public void setQtoMin(int qtoMin) {
        this.qtoMin = qtoMin;
    }

    public String getCalcMed() {
        int calcMed = (qtoMax + qtoMin)/2;
        if (qtoAtual >= calcMed){
            return "Não efetuar compra";
        }
        else{
            return "Efetuar compra!";
        }
    }


}
