package lista9;
public class Familiar extends Contato{
    private GrauParentesco grauParentesco;

    public Familiar(String apelido, String nome, String email, GrauParentesco grauParentesco) {
        super(apelido, nome, email);
        this.grauParentesco = grauParentesco;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grauParentesco= " + grauParentesco;
    }

    @Override
    public String confraternizar() {
        return "Almoço em família.";
    }
}
