package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {

		// função lambda
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));

		// sem as chaves automaticamente aquilo que voce colocou
		// será retornado
		// ja existe um return associado
		// não poderá ter mais de um setença de código
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
	}

}
