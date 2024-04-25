public final class Gato extends Animal implements Correr{

    public Gato(String nome, int idade, TipoAnimal tipo){
        super(nome, idade, tipo);
    }

    @Override
    public void correr(){
        System.out.println(nome + " está correndo!");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando!");
    }

}
