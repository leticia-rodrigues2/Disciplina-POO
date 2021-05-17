abstract class Corredor {

    protected String nome, cidade, paisDeResidencia, tempoDePercurso;
    protected int numero;

    public Corredor(String nome, String cidade, String paisDeResidencia, String tempoDePercurso, int numero) {
        this.nome = nome;
        this.cidade = cidade;
        this.paisDeResidencia = paisDeResidencia;
        this.tempoDePercurso = tempoDePercurso;
        this.numero = numero;
    }

    /* Getter and setter */
    public String getNome() {
        return nome;
    }

    public String getTempoDePercurso() {
        return tempoDePercurso;
    }

}
