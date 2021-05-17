package lista5;

public class MostraConversao {

	public static void main(String[] args) {
double piscina = 1890;
double litros = ConversaoDeUnidadesDeVolum.metroCubicoParalitros(piscina);
System.out.println("Volume da piscina em litros : " + litros);
double pesCubicos = ConversaoDeUnidadesDeVolum.metroCubicoPesCubicos(piscina);
System.out.println("Volume da piscina em  pés  cúbicos   : " + pesCubicos);
double cmCubi = ConversaoDeUnidadesDeVolum.metroCubicoParacentimetrosCubicos(piscina);
System.out.println(" Volume da piscina em centímetros cúbicos: " + cmCubi);

	}

}
