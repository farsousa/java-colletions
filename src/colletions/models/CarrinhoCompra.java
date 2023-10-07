package colletions.models;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	
	List<Item> itens;
	
	public CarrinhoCompra() {
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensASerRemovido = new ArrayList<>();
		for(Item item: this.itens) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itensASerRemovido.add(item);
			}
		}
		this.itens.removeAll(itensASerRemovido);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0.0d;
		for(Item item: this.itens) {
			valorTotal += item.getPreco() * item.getQuantidade();
		}
		return valorTotal;		
	}
	
	public void exibirItens() {
		System.out.println(this.itens);
	}

}
