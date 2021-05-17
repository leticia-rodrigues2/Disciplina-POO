
public class CorredorProfissional extends Corredor {

	private String classificacaoMundial ;

	
	public CorredorProfissional(String nome, String cidade, String paisDeResidencia, String tempoDePercurso, int numero,
			String classificacaoMundial) {
		super(nome, cidade, paisDeResidencia, tempoDePercurso, numero);
		this.classificacaoMundial = classificacaoMundial;
	}

	public String getClassificacaoMundial() {
		return classificacaoMundial;
	}

	public void setClassificacaoMundial(String classificacaoMundial) {
		this.classificacaoMundial = classificacaoMundial;
	}
	
	
}