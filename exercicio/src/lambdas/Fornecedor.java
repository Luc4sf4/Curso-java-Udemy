package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier é uma interface funcional que não te força a receber nenhum parametro
public class Fornecedor {
	public static void main(String[] args) {
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println(umaLista.get());
	}
}
