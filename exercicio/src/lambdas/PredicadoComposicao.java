package lambdas;

import java.util.function.Predicate;

//Predicado é uma interface funcional que recebe parametro e retorna verdadeiro ou falso 
public class PredicadoComposicao {

	public static void main(String[] args) {
		
		//se o modulo do numero divido por 2 for 0 irá retornar null 
		Predicate<Integer> isPar = num -> num % 2 ==0 ;
		Predicate<Integer>isTresDigitos = num -> num >= 100 && num <= 999;
		
		
		//Se colocarmo 123 como exemplo retornará falso, ja que estamos usando os isPar primeiro e ele não é par
		// mas se colocarmo negate
		//embora a exepressão seja falsa, eu neguei ela, então se torna verdadeira
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isPar.or(isTresDigitos).test(123));
		
	}
}
