package lista8;

public class Caderno extends Produto {
    private int numFolhas;
    private String tipo;

 public Caderno(String name, String categoria, double preco, int numFolhas, String tipo) {
        super(name, categoria, preco);
        this.numFolhas = numFolhas;
        this.tipo = tipo;
    }

 public int getNumFolhas() {
        return numFolhas;
    }

 public String getTipo() {
        return tipo;
    }

    @Override
 public String toString() {
        return super.toString() + ", numFolhas= " + numFolhas + ", tipo= " + tipo;
    }
}
