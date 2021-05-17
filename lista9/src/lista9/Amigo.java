package lista9;

public class Amigo extends Contato{
    private GrauAmizade grauAmizade;

    public Amigo(String apelido, String nome, String email, GrauAmizade grauAmizade) {
        super(apelido, nome, email);
        this.grauAmizade = grauAmizade;
    }

    @Override
    public String confraternizar() {
        return "Partiu churrasco.";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grauAmizade=" + grauAmizade;
    }
}
