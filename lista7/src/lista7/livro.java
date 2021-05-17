package lista7;

public class livro {
	private String  titulolivro;
	private String autores;
	private String genero;	
	
	public livro(String livro, String autores, String genero) {
		this.titulolivro= livro;
		this.autores = autores;
		this.genero = genero;
	}

	public String getTitulolivro() {
		return titulolivro;
	}

	public void setTitulolivro(String titulolivro) {
		this.titulolivro = titulolivro;
	}
	
	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((titulolivro == null) ? 0 : titulolivro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		livro other = (livro) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (titulolivro == null) {
			if (other.titulolivro != null)
				return false;
		} else if (!titulolivro.equals(other.titulolivro))
			return false;
		return true;
	}
}
