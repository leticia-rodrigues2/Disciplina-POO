package Ex1;

import java.util.Date;

public class Calendario {
	private Integer mes;
	private Integer dia;

	public Integer getMes() {
		return mes;
	}

	public Integer getDia() {
		return dia;
	}

	public Calendario() {
		Date data = new Date();
		dia = data.getDate();
		mes = data.getMonth();
	}

	public void MudarData(Integer dia, Integer mes) {
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
				&& ((dia >= 1) && dia <= 31)) {
			this.dia = dia;
			this.mes = mes;

		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {
			this.dia = dia;
			this.mes = mes;
		}

		else if ((mes == 2) && (dia >= 1 && dia <= 28)) {
			this.dia = dia;
			this.mes = mes;
		} else {
			System.out.println("DATA INVALIDA");

		}
	}

	public void AcrescentarDia() {
		dia += 1;
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
			mes += 1;

		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			mes += 1;

		} else if (mes == 2 && dia > 28) {
			mes += 1;
		}

		if (mes > 12) {
			mes = 1;
		}

	}

}