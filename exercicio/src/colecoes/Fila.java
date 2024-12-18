package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e add -> adicionam elementos na fial
		//Diferença é comportamento quando a fila está cheia 
		fila.add("Ana");//retorna false
		fila.offer("Bia");//Lança uma execeção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafela");
		fila.offer("Guia");
		
		//Peek e Element -> obter próximo elemento da fila sem remover
		//Diferença é o comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek());//retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
//		
//		fila.sizer();
//		fila.clear();
//		fila.isEmpty();
		
		//Pool e Remove -> obter próximo elemento da fila e remove
		System.out.println(fila.poll());//retorna false
		System.out.println(fila.remove());//Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
	}

}
