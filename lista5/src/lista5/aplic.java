package lista5;

import java.util.Scanner;

public class aplic {

	public static void main(String[] args) {
		
		//Lista 5 - Métodos estáticos
		
		Scanner entrada= new Scanner(System.in);
		
		 int resp =0;
		
		
		do {
		System.out.println();
		System.out.println("Digite (1) para conveter :  De graus Celsius (C) para graus Fahrenheit (F)");
		System.out.println("Digite (2) para conveter : De graus Fahrenheit (F) para graus Celsius (C)");
		System.out.println("Digite (3) para conveter : De graus Celsius (C) para graus Kelvin (K)");
		System.out.println("Digite (4) para conveter : De graus Kelvin (K) para graus Celsius (C)");
		System.out.println("Digite (5) para conveter : De graus Kelvin (K) para graus Fahrenheit (F)");
		System.out.println("Parar o programa (6)");
		System.out.println();
		resp=entrada.nextInt();
		
		if (resp == 1) {
			System.out.println("Digite o valor :");
			double valor = entrada.nextDouble();
			double fahr = Converte.celsiusParaFahrenheit(valor);
			System.out.println();
			System.out.println("De graus Celsius para graus Fahrenheit é : " + fahr);
		}
		
		if(resp == 2) {
			System.out.println("Digite o valor :");
			double valor2 = entrada.nextDouble();
			double celsi = Converte.fahrenheitParaCelsius(valor2);
			System.out.println("De graus Fahrenheit para graus Celsius é : " + celsi);
		}
		
		if(resp == 3) {
			System.out.println("Digite o valor :");
			double valor3 = entrada.nextDouble();
			double kelv = Converte.celsiusParaKelvin(valor3);
			System.out.println("De graus Celsius (C) para graus Kelvin é :  " + kelv);
		}
		
		if (resp == 4) {
			System.out.println("Digite o valor :");
			double valor4 = entrada.nextDouble();
			double celsius = Converte.kelvinParaCelsius(valor4);
			System.out.println("De graus Kelvin (K) para graus Celsius"+ celsius);
		}
		if (resp == 5) {
			System.out.println("Digite o valor :");
			double valor5 = entrada.nextDouble();
			double fahr = Converte.kelvinparaFahrenheit(valor5);
			System.out.println("De graus Kelvin (K) para graus Fahrenheit" + fahr);
		}
		
		} while(resp !=6);
		System.out.println("********* FIM **********");
		
		
		entrada.close();	
		}
}