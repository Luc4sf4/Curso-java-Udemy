package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		// possibilidade de misturar varias coisas
		// Converte de primitivo para Classe
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		// conta quantos atributos tem dentro do conjunto
		System.out.println("tamanho é " + conjunto.size());

		conjunto.add("Teste");
		conjunto.add('X');
		System.out.println("tamanho é " + conjunto.size());

		// remove os atributos dentro do conjunto
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("tamanho é " + conjunto.size());

		//verifica se contém o atributo dentro do conjunto
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//união do conjunto e de nums
		//conjunto.addAll(nums);
		
		//retenção de conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//limpar o conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
