package classe;

public class PrimeiroTrauma {
	
	int a = 3; //não pode mexer aqui
	static int b = 4;
	

	public static void main(String[] args) {
		
		// só é possível acessar um membro 
		// de instancia a partir de um método estático
		//se voce criar uma instancia
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);
		
	}

}
