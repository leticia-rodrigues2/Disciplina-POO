package lista7;

public class Biblioteca {
	
	private  livro [] livros = new livro[MAXLIVROS];
	public static final Integer MAXLIVROS = 100;

	public void addLivro (livro livro) {
		if(this.qntdLivros() == Biblioteca.MAXLIVROS) {
			return;
		}
		for(int i = 0; i < livros.length; i++) {
			if (livros[i] == null) {
				livros[i] = livro;
				break;
			}
		}
	}
	
	public void dellLivro(livro livro) {
		for(int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].equals(livro)) {
				livros[i] = null;		
				break;
			}
		}
		
	}

	public String nomeLivro (String nome) {
		for (int i = 0; i<livros.length ; i++) 
		{
			if(livros[i] != null && livros[i].getTitulolivro() == nome)
			{
				return livros[i].getTitulolivro();
			}
			
		}
		return "";
	}
	
	public String todNome () {
		String nomes= "" ;
		for (int i = 0; i<livros.length ; i++) 
		{
			if(livros[i] != null) {
				nomes += livros[i].getTitulolivro() + "\n" ;
			}			
		}
		return nomes;
	}
	
	public String todLivroGene (String nomeGene){
		String nomesPorGene="";
	
		for (int i = 0; i<livros.length ; i++) {
			
			if (livros[i] != null && nomeGene == livros[i].getGenero()){
				
				nomesPorGene += livros[i].getTitulolivro() + "\n" ;
			}
		
		}
		return nomesPorGene;
	}
	
	public Integer qntdLivros() 
	{
		int qntdLivros = 0;
		for (int i = 0; i<livros.length ; i++)
		{
			
			if (livros[i]!= null)
			{
				
				qntdLivros+=1;
			}
		}
		return qntdLivros ;
	}
	
	public Integer espaLivre() {
		
		return Biblioteca.MAXLIVROS - qntdLivros();
	}
}