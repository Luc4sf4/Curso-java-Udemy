package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
//		1. A partir do produto calcular o preco real (com desconto)
//		2. Imposto Municipal: >= 2500(8,5%)/ < 2500(isento)
//		3. Frete: >= 3000(100) / < 3000(50)
//		4. Arredondar: Deixar duas casas decimais
//		5. Formatar: R$ 1234,56
//		
		
		
		Function<Produto, Double> precoFinal = prod -> prod.preco * (prod.desconto * 1);
		UnaryOperator<Double> impostoMunicipal = preco ->  preco >= 2500 ? preco * 1.085 : preco ;
		UnaryOperator<Double> frete= preco -> preco >= 300 ? preco + 100: preco + 50;
		UnaryOperator<Double> arredondar= preco -> Double .parseDouble(String.format("%2.f", preco));
		Function<Double, String> formatar= preco -> ("R$" + preco).replace(".", ",");
		
		Produto p1 = new Produto("Ipad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p1);
		
		System.out.println(preco);
				
		
		
		
	}

}
