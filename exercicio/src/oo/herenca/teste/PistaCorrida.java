package oo.herenca.teste;

import oo.herenca.desafio.Civic;
import oo.herenca.desafio.Ferrari;

public class PistaCorrida {
	public static void main(String[] args) {

		Civic civic = new Civic(100);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		
		System.out.println("Civic" + civic);

		Ferrari ferrari = new Ferrari(150);

		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);

	}

}
