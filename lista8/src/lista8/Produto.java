package lista8;

public abstract class Produto {
    private String name;
    private String categoria;
    private double preco;

    public Produto(String name, String categoria, double preco) {
        this.name = name;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "name= " + name + ", categoria= " + categoria + ", preco= " + preco;
    }
}