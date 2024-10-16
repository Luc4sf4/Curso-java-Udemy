package oo.composicao.desafios;

public class ClienteTeste {
	public static void main(String[] args) {
		
		
		
		Compra c1 = new Compra();
		c1.adicionarItem("Caneta", 9.57, 100);
		c1.adicionarItem(new Produto("NoteBook", 1897.88), 2);
		
		Compra c2 = new Compra();
		c2.adicionarItem("Caderno", 10, 10);
		c1.adicionarItem(new Produto("Impressora", 998.90), 1);
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(c1);
		cliente.adicionarCompra(c2);
		
		System.out.println(cliente.obterValorTotal());
		
	}

}
