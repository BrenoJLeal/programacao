public class Aluno extends Pessoa{
    private int mat;

    public Aluno(String nome, int mat,int idade){
        super(nome,idade);
        this.mat = mat;
    }
    public int getMat() {
        return mat;
    }

}
