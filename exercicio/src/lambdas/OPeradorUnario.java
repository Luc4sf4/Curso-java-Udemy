package lambdas;

import java.util.function.UnaryOperator;

public class OPeradorUnario {
	
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		//começa de cima pra baixo
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
				
		System.out.println(resultado1);
		
		//começa de baixo pra cima
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado2);
	}
}
