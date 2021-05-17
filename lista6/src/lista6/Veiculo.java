package lista6;


public class Veiculo {
	private String placa;
	private String cor;
	private String modelo;

	public Veiculo(String placa, String cor, String modelo) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

}