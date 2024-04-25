public final class Cachorro extends Animal implements Correr {
    public Cachorro(String nome, int idade, TipoAnimal tipo) {
        super(nome, idade, tipo);
    }
    @Override
    public void comer(){
        System.out.println(nome + " está comendo!");
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + " está latindo!");
    }
    @Override
    public void correr(){
        System.out.println(nome + " está correndo!");
    }
}
