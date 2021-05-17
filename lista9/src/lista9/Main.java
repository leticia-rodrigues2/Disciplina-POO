package lista9;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
    	//  Herança e classe abstrata 
        List<Contato> contatos = Arrays.asList(
                new Familiar("Tio Marcinho", "Marcio", "marcio@gmail.com", GrauParentesco.TIO),
                new Familiar("Papai", "Marcos", "marcos@gmail.com", GrauParentesco.PAI),
                new Amigo("Ana", "Ana", "ana@gmail.com", GrauAmizade.MELHORES_AMIGOS),
                new Amigo("Joyce", "Joyce", "joyce@gmail.com", GrauAmizade.AMIGO),
                new Colega("Nuna", "Edivaldo", "nuna@gmail.com", TipoContato.VIZINHO)
        );

        for (Contato c: contatos) {
            System.out.println(c);
            System.out.println(c.confraternizar());
        }
    }
}