package oo.composicao.desafios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;

	final List<Compra> compras = new ArrayList<>();
			
	
	double obterValorTotal(){
		double total = 0;
		
		for(Compra compra: compras){
			total += compra.obterValorTotal();
		}
		
		return total;
	}
	
	void adicionarCompra(Compra compra){
		this.compras.add(compra);
	}
	
	public Cliente(String nome) {
		this.nome = nome;

	}
	
	
}
