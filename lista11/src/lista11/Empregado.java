package lista11;

import java.util.Calendar;

public class Empregado extends Pessoa implements Funcionario {
	private int anoAdmissao;
	private double horasTrabalhadas;
	private double precoHora;

	public Empregado(String nome, int anoAdmissao, double precoHora, double horasTrabalhadas) {
		super(nome);
		this.anoAdmissao = anoAdmissao;
		this.horasTrabalhadas = horasTrabalhadas;
		this.precoHora = precoHora;
	}

	@Override
	public double salario() {
		return this.precoHora * this.horasTrabalhadas;
	}

	@Override
	public int anosDeCasa() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.YEAR) - anoAdmissao;

	}
}
