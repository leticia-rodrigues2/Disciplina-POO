public class CorredorFantasia extends CorredorAmador {
  private String descricaoFantasia;
 
  
public CorredorFantasia(String nome, String cidade, String paisDeResidencia, String tempoDePercurso, int numero,
		double recurso, String descricaoFantasia) {
	super(nome, cidade, paisDeResidencia, tempoDePercurso, numero, recurso);
	this.descricaoFantasia = descricaoFantasia;
}

public String getDescricaoFantasia() {
	return descricaoFantasia;
}

public void setDescricaoFantasia(String descricaoFantasia) {
	this.descricaoFantasia = descricaoFantasia;
}
   

   
   

}

