package oo.composicao.desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(quantidade, p));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produtos = new Produto(nome, preco);
		this.itens.add(new Item(qtde,produtos));
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {

			total += item.quantidade * item.produto.preco;

		}
		return total;
	}

}
