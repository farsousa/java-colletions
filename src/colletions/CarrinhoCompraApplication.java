package colletions;

import java.util.Collection;
import java.util.Collections;

import colletions.models.CarrinhoCompra;

public class CarrinhoCompraApplication {
	
	public static void main(String [] args) {
		CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
		
		System.out.println("Iniciando o objeto de carrinho de compras");
		System.out.println("Valor total do carrinho: R$ " + String.format("%.2f", carrinhoCompra.calcularValorTotal()));
		System.out.println();
		
		System.out.println("Adicionando  itens");
		carrinhoCompra.adicionarItem("Arroz", 21.90, 1);
		carrinhoCompra.adicionarItem("Feij�o", 8.35, 1);
		carrinhoCompra.adicionarItem("Desodorante", 16.75, 2);
		carrinhoCompra.adicionarItem("Sabonetes Rexona", 3.49, 5);
		carrinhoCompra.adicionarItem("Arroz", 21.90, 1);
		System.out.println("Valor total do carrinho: R$ " + String.format("%.2f", carrinhoCompra.calcularValorTotal()));
		System.out.println();
		
		System.out.println("Exibindo itens");
		carrinhoCompra.exibirItens();
		System.out.println();
		
		System.out.println("Ordenando itens por pre�o");
		System.out.println(carrinhoCompra.ordenarPorPreco());
		System.out.println();
		
		System.out.println("Ordenando itens por quantidade");
		System.out.println(carrinhoCompra.ordenarPorQuantidade());
		System.out.println();
		
		System.out.println("Removendo itens");
		carrinhoCompra.removerItem("Arroz");
		System.out.println("Valor total do carrinho: R$ " + String.format("%.2f", carrinhoCompra.calcularValorTotal()));
		
		
		
	}

}
