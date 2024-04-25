public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal (String nome, int idade, TipoAnimal tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    private final TipoAnimal tipo;
    public TipoAnimal getTipo() {

        return tipo;
    }
    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal" +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", tipo = " + tipo;

    }
}

