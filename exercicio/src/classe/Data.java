package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;

		// this como metodo só poder usar dentro de outro construtor e serve pra chamar
		// de um construtor para
		// para outro construtor
		this(1, 1, 1970);
		
		//byte, short, int, long -> 0
		//float, double -> 0.0
		// boolean -> false
		//char -> " /u000"
		//Objetos -> null
		

	}	

	// o "this." referenciar o objeto que esta sendo criado naquele momento
	// quando usar ? se usa para referenciar atributos da classe
	Data(int dia, int mes, int ano) {

		// como acessar a variavel de instancia ?
		this.dia = dia;// pega o valor que recebeu como parametro e altera a variavel de instancia
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		// final define se a variavel é local
		// varaivel local == variacel declarada dentro do corpo de um metodo
		final String formato = "%d/%d/%d";// variavel local

		return String.format(formato, dia, mes, ano);
	}

	void imprimirDataFormatada() {
		
		System.out.println(obterDataFormatada());
	}
	//pertence a instancia então pode-se ser usado em todos os métodos
	//String formato = "%d/%d/%d";
	
}
