package lambdas;

import java.util.function.Predicate;

public class Predicato {
	public static void main(String[] args) {
		
		
		//Predicate return true or false
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1- prod.desconto))>=750 ;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}

}
