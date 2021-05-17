package lista8;

public class Caneta extends Produto {
    private String cor;

    public Caneta(String name, String categoria, double preco, String cor) {
        super(name, categoria, preco);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + ", cor= " + cor;
    }
}
