//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Rex", 2, TipoAnimal.MAMIFERO);
        Gato g = new Gato("Felix", 4, TipoAnimal.MAMIFERO);
        Passarinho p = new Passarinho("Piupiu", 10,TipoAnimal.AVE);
        System.out.println("---- Cachorro ----");
        System.out.println(c);
        c.correr();
        c.emitirSom();

        System.out.println("---- Gato ----");
        System.out.println(g);
        g.correr();
        g.emitirSom();

        System.out.println("---- Passarinho ----");
        System.out.println(p);
        p.voar();
        p.emitirSom();


    }
}