package classe;

public class Produto {

	// Atributo
	String nome;
	double preco;
	static double desconto = 0.25;

	// Construtor padrão que não receberá parametros
	Produto() {
	}

	

	// Construtor com parametros
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

}
