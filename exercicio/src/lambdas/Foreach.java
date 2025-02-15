package lambdas;

import java.util.Arrays;
import java.util.List;

import javax.naming.Reference;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma tradicional...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\n Method Reference#01...");
		aprovados.forEach(System.out::println);//:: => referencia de um metodo
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\n Method Reference #02...");
		aprovados.forEach(Foreach :: meuImprimir);//:: => referencia de um metodo

	}
	
	static void meuImprimir(String nome){
		System.out.println("oi mue nome é " + nome);
	}
}
