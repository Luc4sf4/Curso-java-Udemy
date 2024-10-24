package lambdas;

@FunctionalInterface // só pode ter apenas um método
public interface Calculo {

	// interface funcional é um conceito que ira ajudar
	// a criar as funções lambdas -> funções anonimas
	//interface funcional permite apenas um metodo abstrato
	double executar(double a, double b);
	
	default String legal(){
		return "Legal";
	}
	
	static String muitoLegal(){
		return "muito legal";
	}
}
