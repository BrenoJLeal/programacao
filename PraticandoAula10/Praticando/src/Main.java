//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal c1 = new Cachorro("Java", 1,TipoAnimal.MAMIFERO);
        Animal g1 = new Gato("Mia",8, TipoAnimal.MAMIFERO);
        Animal p1 = new Passarinho("Fenix", 11, TipoAnimal.AVE);
        Transformacao t = new Transformacao();

        System.out.println("---- Lista de Cachorros ---- ");
        System.out.println("\nExemplo 1: Java");
        System.out.println(c1);
        c1.emitirSom();
        ((Cachorro)c1).correr();

        System.out.println("\nExemplo 2: Rex");
        t.fazerComer(new Cachorro("Rex", 12, TipoAnimal.MAMIFERO));
        t.praticarCorrida(new Cachorro("Rex", 12, TipoAnimal.MAMIFERO));

        System.out.println("---- Lista de Gatos ---- ");
        System.out.println("\nExemplo 1: Mia");
        System.out.println(g1);
        g1.emitirSom();
        ((Gato)g1).correr();

        System.out.println("\nExemplo 2: Lira");
        t.fazerComer(new Gato("Lira", 10, TipoAnimal.MAMIFERO));
        t.praticarCorrida(new Gato("Lira", 10, TipoAnimal.MAMIFERO));

        System.out.println("---- Lista de Passaros ----");
        System.out.println("\nExemplo 1: Fenix");
        System.out.println(p1);
        p1.emitirSom();
        ((Passarinho)p1).voar();

        System.out.println("\nExemplo 2: Carmelo");
        t.fazerComer(new Passarinho("Carmelo", 15, TipoAnimal.AVE));
        t.praticarVoo(new Passarinho("Carmelo", 15, TipoAnimal.AVE));

    }
}