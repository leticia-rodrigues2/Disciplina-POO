package lista7;

public class AppBiblioteca {

	public static void main(String[] args) {
		//Lista 7 - Relacionamentos entre classes II

		Biblioteca biblioteca  = new Biblioteca();
		livro livro1 = new livro ("joao","rosa maria","ação");
		livro livro2 = new livro ("joao2","rosa maria","ação");
		biblioteca.addLivro(livro1);
		biblioteca.addLivro(livro2);
		biblioteca.addLivro(new livro ("joao3","rosa maria","ação"));
		biblioteca.addLivro(new livro ("joao4","rosa maria","ação"));
		biblioteca.addLivro(new livro ("joao5","rosa maria","romance"));
		
		 System.out.println(biblioteca.todNome());
		 pesquisarNomeLivro("joao", biblioteca);
		 pesquisarNomeLivro("teste", biblioteca);
		 System.out.println("Quantidade de livors: " + biblioteca.qntdLivros());
		 biblioteca.dellLivro(livro1);
		 biblioteca.dellLivro(livro2);
		 System.out.println("Ainda cabem " + biblioteca.espaLivre() + " livros");
		 biblioteca.addLivro(livro1);
		 System.out.println(biblioteca.todLivroGene("romance"));
		 System.out.println(biblioteca.todNome());
	}

	private static void pesquisarNomeLivro(String nome, Biblioteca biblioteca) {
		String result = biblioteca.nomeLivro(nome);
		if (result.length() > 0) {
			System.out.println(result);
		} else {
			System.out.println("Livro não encontrado");
		}
		
	}

}
