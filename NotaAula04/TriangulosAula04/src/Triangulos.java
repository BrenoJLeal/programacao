public class Triangulos {
    private Double l1;
    private Double l2;
    private Double l3;

    public void setL1(Double l1) {
        this.l1 = l1;
    }

    public void setL2(Double l2) {
        this.l2 = l2;
    }

    public void setL3(Double l3) {
        this.l3 = l3;
    }

    public String getResult() {
        if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
            if (l1.equals(l2) && l2.equals(l3)){
                return "Equilátero";
            } else if(l1.equals(l2) || l2.equals(l3) || l1.equals(l3)){
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        } else {
            return "Não é um triângulo";
        }
    }
}