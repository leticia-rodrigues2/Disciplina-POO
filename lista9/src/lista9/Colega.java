package lista9;

public class Colega extends Contato {
    private TipoContato tipo;

    public Colega(String apelido, String nome, String email, TipoContato tipo) {
        super(apelido, nome, email);
        this.tipo = tipo;
    }

    @Override
    public String confraternizar() {
        return "Happy Hour.";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tipo=" + tipo;
    }
}