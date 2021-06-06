package lista13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		int [] vet = new int[] { 4, 8, 2, 6, 1, 5, 9 };
		int pos;
		char resp;
		Scanner ent = new Scanner(System.in);
		boolean continua = true;
		while (continua)
		{
			try {			 
			System.out.println("Digite uma posição do vetor: ");
			 pos = ent.nextInt ();
			 ent.nextLine();
			
			 System.out.println("O elemento da pos " + pos + " é: " + vet[pos]);
			 System.out.println("Deseja continuar (s/n)?");
			 resp = ent.nextLine().charAt(0);
			 if(resp!= 'n' && resp !='s') {
				 throw new IllegalArgumentException();
				 }
			 
			 if (resp == 'n') 
			 continua = false;
			}
			catch(InputMismatchException e) {
				ent.nextLine();
				System.out.println("Valor digitado não é um número inteiro");
				
			}
			catch(ArrayIndexOutOfBoundsException  e) {
				System.out.println("Valor é uma posição inexistente no vetor");
				
			}
			catch(IllegalArgumentException e) {
				System.out.println("Resposta diferente de 's' ou 'n");
				
			}
			catch(Exception e) {
				System.out.println("Erro");
				
			}
			
			
		}
		ent.close();
	}
}
