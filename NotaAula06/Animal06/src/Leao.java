//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Leao extends Animal {
    private String pelo;

    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    public void exibirInformacoes() {
        System.out.println("Classe: " + classe);
        System.out.println("Locomocao: " + locomocao);
        System.out.println("Pelo: " + pelo);
    }
}
