package lista6;

public class Estacionamento {
	public static final int NUMMAXVAGAS = 50; 
	public String nome;
	
	private Veiculo[] vagas= new Veiculo[NUMMAXVAGAS];
	
	private int numTotalVagas;
	private int numVagasLivres ; 

	
	
	public Estacionamento(String nomeEstabelecimento, int totalVagas) {
		if (totalVagas <=  NUMMAXVAGAS ) {
			nome =  nomeEstabelecimento;
			numTotalVagas = totalVagas;
			numVagasLivres = totalVagas;
			for(int i =0; i < vagas.length ; i++) {
				vagas[i]=null;
			}
		}
	}
	
	public int estacionar(Veiculo carro) {
		if (numVagasLivres > 0) {
			for(int i =0; i < vagas.length ; i++) {
				if (vagas[i] == null) {
					vagas[i]=carro;
					numVagasLivres--;
					return i ;
				
				}
			}
			
		}
		return -1;
	}
	
	
	public int obterVagaOcupada(Veiculo carro)
	{
		
		for(int i =0; i < vagas.length ; i++) 
		{
		
				if  ((vagas[i] != null ) &&(carro.getPlaca() == vagas[i].getPlaca()))
				{
					return i;
				}
		   
		}
		return-1;
				
	}
	
	 public void retirarVeiculo(int numVaga){
		if (numVaga<= NUMMAXVAGAS) {
		 vagas[numVaga]= null;
		 numVagasLivres++;
		}
	}
	 
	 
	 public int getNumVagasLivres(){
		 return numVagasLivres;
	 }
	public String ocupacaoEstacionamento()
	{
		String  posi = "";
	
		for(int i =0; i < vagas.length ; i++)
		{
			if (vagas[i] == null)
			{
				posi = posi +  i + " vazio \n" ;
			}
			else
			{
				posi = posi +  i + vagas[i].getPlaca() + " \n";
			}
		}
		return posi ;
	}
}

