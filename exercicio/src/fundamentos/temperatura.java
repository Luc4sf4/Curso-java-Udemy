package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		double fahrenheit = 86;
		final double fator = 5.0/ 9.0;
		final double ajuste = 32;
		
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado é -> " + celsius + "C.");
	}
	
	
	
}
