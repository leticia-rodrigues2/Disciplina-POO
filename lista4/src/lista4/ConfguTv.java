package lista4;

import java.util.Scanner;

public class ConfguTv {
	// Classes, coesão, acoplamento e encapsulamento

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resp = 0;
		Tv tv = new Tv();
		do {
			System.out.println("Canal: " + tv.getCanal());
			System.out.println("Volume : " + tv.getVolume());
			System.out.println("Trocar canal (1)");
			System.out.println("Proximo canal (2)");
			System.out.println("Canal anterior (3)");
			System.out.println("Aumentar volome (4)");
			System.out.println("Diminuir volume (5)");
			System.out.println("Desligar(6)");
			resp = entrada.nextInt();

			if (resp == 1) {
				System.out.println("Digite o canal");
				int novoCanal = entrada.nextInt();
				tv.mudarCanal(novoCanal);
			} else if (resp == 2) {
				tv.proximoCanal();
			} else if (resp == 3) {
				tv.canalAnterior();
			} else if (resp == 4) {
				tv.aumentarVolume();
			} else if (resp == 5) {
				tv.abaixarVolume();
			}
		} while (resp != 6);
		entrada.close();
	}

}
