public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
        super();
        this.nome = nome;
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

}
