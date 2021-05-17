package lista9;

public abstract class Contato {
    private String apelido;
    private String nome;
    private String email;

    public Contato(String apelido, String nome, String email) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
    }

    public abstract String confraternizar();

    @Override
    public String toString() {
        return "apelido= " + apelido +
                ", nome= " + nome +
                ", email= " + email;
    }
}
