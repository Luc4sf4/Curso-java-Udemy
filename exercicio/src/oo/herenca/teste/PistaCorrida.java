package oo.herenca.teste;

import oo.herenca.desafio.Carro;
import oo.herenca.desafio.Civic;
import oo.herenca.desafio.Ferrari;

public class PistaCorrida {
	public static void main(String[] args) {

		Carro civic = new Civic(100);
		
		civic.acelerar();		
		System.out.println("Civic" + civic);
		
		civic.acelerar();		
		System.out.println("Civic" + civic);

		civic.acelerar();		
		System.out.println("Civic" + civic);

		Ferrari ferrari = new Ferrari(150);
		ferrari.ligarAr();
		ferrari.ligarTurbo();
		ferrari.desligarAr();

		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);

	}

}
