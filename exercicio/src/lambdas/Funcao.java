package lambdas;

import java.util.function.Function;

//obs: funções muito grandes dificilmente serão reutilizadas dentro do seu sistemas

public class Funcao {
	public static void main(String[] args) {
		//Entra inteiro e sai String
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		System.out.println(parOuImpar.apply(32));

		//resultado entra nessa função
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		//que passa para essa função
		Function<String, String> empolgado =  valor -> valor + " !!!";
		
		Function<String, String> duvida =  valor -> valor + " ???";
		
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33);
		
		System.out.println(resultadoFinal2);
	}

}
