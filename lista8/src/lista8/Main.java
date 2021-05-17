package lista8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Lista 8 - Herança
        Scanner entrada = new Scanner(System.in);
        Produto[] produtos = new Produto[] {
                new Caderno("Caderno 1", "Material Escolar", 15.00, 200, "Capa dura / Arame"),
                new Caderno("Caderno 2", "Material Escolar", 7.50, 100, "Capa dura / Brochura"),
                new Caneta("Caneta 1", "Material Escolar", 3.25, "Vermelha"),
                new Caneta("Caneta 2", "Material Escolar", 3.25, "Preta"),
                new Celular("Moto One", "Smartphones", 1200, "Motorola", "One XT2055")
        };

        List<Produto> carrinhoDeCompra = new ArrayList<>();

        int op = 0;

        do {
            System.out.println("1 - Visualizar Produtos");
            System.out.println("2 - Visualizar Carrinho");
            System.out.println("0 - Sair");
            op = entrada.nextInt();
            switch (op) {
                case 0: break;
                case 1:
                    int opProduto = 0;
                    mostrarOpcoes(produtos);
                    opProduto = entrada.nextInt();
                    if (0 < opProduto && opProduto <= produtos.length) {
                        Produto p = produtos[opProduto-1];
                        carrinhoDeCompra.add(p);
                        System.out.println("Produto " + p.getName() + " adicionado ao carrinho");
                    } else if (opProduto != 0) {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 2:
                    mostrarCarrinho(carrinhoDeCompra);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println();
        } while (op != 0);
        System.out.println("Até mais!");
    }

    private static void mostrarOpcoes(Produto[] produtos) {
        System.out.println("Produtos");
        for (int i = 0; i < produtos.length; i++) {
            Produto p = produtos[i];
            System.out.println(String.valueOf(i + 1) + " - " + p);
        }
        System.out.println("0 - Voltar");
    }

    private static void mostrarCarrinho(List<Produto> produtos) {
        System.out.println("Carrinho de Compras");
        double total = 0.0;
        for (Produto p: produtos) {
            total += p.getPreco();
            System.out.println(p);
        }
        System.out.println("Valor total: " + total);
    }
}
