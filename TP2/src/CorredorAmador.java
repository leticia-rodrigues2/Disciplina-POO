public class CorredorAmador extends Corredor {

    protected double recurso;

    public CorredorAmador(String nome, String cidade, String paisDeResidencia, String tempoDePercurso, int numero, double recurso) {
        super(nome, cidade, paisDeResidencia, tempoDePercurso, numero);
        this.recurso = recurso;
    }

    public double getRecurso() {
        return recurso;
    }

}