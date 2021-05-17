package lista11;

public class Main {

    public static void main(String[] args) {
	// Lista 11 - Interface
        Empregado E = new Empregado("João Pessoa", 1998, 15.5, 30);
        System.out.println(E);
        System.out.println ("Pagamento a efetuar: R$" + String.format("%.2f",E.salario()));
        System.out.println ("Anos de casa: " + E.anosDeCasa());
    }
}