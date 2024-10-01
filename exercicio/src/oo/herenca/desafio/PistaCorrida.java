package oo.herenca.desafio;

public class PistaCorrida {
	public static void main(String[] args) {

		Civic civic = new Civic();

		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic);

		Ferrari ferrari = new Ferrari();

		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);

	}

}
