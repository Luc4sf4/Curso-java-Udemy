package lambdas;

@FunctionalInterface // só pode ter apenas um método
public interface Calculo {
	
	//interface funcional é um conceito que ira ajudar
	// a criar as funções lambdas -> funções anonimas 
	
	 double executar(double a, double b);
}
