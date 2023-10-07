package colletions.models;

import java.util.Comparator;

public class Item implements Comparable<Item> {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "| Preco: "+ this.preco + "| Quantidade: " + this.quantidade;
	}

	@Override
	public int compareTo(Item o) {
		return Double.compare(preco, o.getPreco());
	}
	
	

}

class ComparatorPorQuantidade implements Comparator<Item> {
	  @Override
	  public int compare(Item i1, Item i2) {
	    return Integer.compare(i1.getQuantidade(), i2.getQuantidade());
	  }
}
