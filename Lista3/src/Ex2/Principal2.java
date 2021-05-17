package Ex2;

import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		//Classes, coesão e encapsulamento
		Scanner entrada = new Scanner(System.in);
		int resp;

		System.out.println("Digite a quandide de andares no elevador");
		int qntdAndar = entrada.nextInt();

		System.out.println("Qual é a capacidade maxima de pessoas do elevador");
		int capacidadeMax = entrada.nextInt();

		Elevador elevador = new Elevador(capacidadeMax, qntdAndar);

		do {
			System.out.println();
			System.out.println("***** Estado atual do elevador ****");
			System.out.println("Capcidade Maxima: " + elevador.getMaCap());
			System.out.println("Quandidade de pessoas no elevador: " + elevador.getQntdPessoas());
			System.out.println("Qauntidade de andares: " + elevador.getQntdAndares());
			System.out.println("Andar atual: " + elevador.getAndarAtual());

			System.out.println();

			System.out.println("*********** OPIÇÕES *************");
			System.out.println("Para entrar no elevador(1)");
			System.out.println("Para sair do elevador(2)");
			System.out.println("Para subuir digite (3)");
			System.out.println("Para descer digite (4)");
			System.out.println("Para terminar o programa(5)");

			resp = entrada.nextInt();
			if (resp == 1) {
				elevador.entrar();

			} else if (resp == 2) {
				elevador.sair();
			} else if (resp == 3) {
				elevador.subir();
			} else if (resp == 4) {
				elevador.descer();
			}

		} while (resp != 5);

		entrada.close();

	}

}