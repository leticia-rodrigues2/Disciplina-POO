package lista4;

public class Tv {
	private Integer canal = 1;
	private Integer volume = 0;
	private static Integer CANALMAX = 150;
	private static Integer CANALMIN = 1;

	public Integer getCanal() {
		return canal;
	}

	public Integer getVolume() {
		return volume;
	}

	public void mudarCanal(int numeroCanal) {
		if ((numeroCanal >= 1) && (numeroCanal <= CANALMAX)) {
			canal = numeroCanal;

		}

	}

	public void proximoCanal() {
		if (canal < CANALMAX) {
			canal += 1;
		} else {
			canal = CANALMIN;
		}
	}

	public void canalAnterior() {
		if (canal > CANALMIN) {
			canal--;
		} else {
			canal = CANALMAX;
		}
	}

	public void aumentarVolume() {
		if (volume < 100) {
			volume += 1;
		}
	}

	public void abaixarVolume() {
		if (volume > 0) {
			volume -= 1;
		}
	}

}
