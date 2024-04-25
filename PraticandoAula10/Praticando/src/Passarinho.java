public final class Passarinho extends Animal implements Voar{
    public Passarinho(String nome, int idade, TipoAnimal tipo) {
        super(nome, idade, tipo);
    }
    @Override
    public void comer(){
        System.out.println(nome + " está comendo!");
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + " está cantando!");
    }
    @Override
    public void voar(){
        System.out.println(nome + " está voando!");
    }
}
