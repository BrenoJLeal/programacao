public class Custo {
    private int fruta;
    private Double valor;


    public int getFruta() {
        return fruta;
    }

    public void setFruta(int fruta) {
        this.fruta = fruta;
    }

    public Double getValor() {
        if (fruta >= 12) {
            return fruta * 1.00;
        } else {
            return fruta * 1.30;
        }
    }

}
