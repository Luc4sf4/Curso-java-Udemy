package classe;

public class Produto {

	// Atributo
	String nome;
	double preco;
	double desconto;

	// Construtor padrão que não receberá parametros
	Produto() {
	}

	

	// Construtor com parametros
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

}
