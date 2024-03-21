public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;

    }


    public void mostrarDetalhes(){
        System.out.println("Marca: "+ marca + " Modelo: " + modelo);

    }




}
