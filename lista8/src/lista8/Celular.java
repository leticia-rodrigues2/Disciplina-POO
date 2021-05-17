package lista8;

public class Celular extends Produto {
    private String marca;
    private String modelo;

    public Celular(String name, String categoria, double preco, String marca, String modelo) {
        super(name, categoria, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + ", marca= " + marca + ", modelo= " + modelo;
    }
}