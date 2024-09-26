package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		final Carro c1 = new Carro();
		System.out.println(c1.estarLigado());
		
		c1.ligar();
		System.out.println(c1.estarLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelarar();
		c1.acelarar();
		c1.acelarar();
		c1.acelarar();
		
		System.out.println();
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		
		
		// Faltou Encapsulamento!!
		// c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		//Relação bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}

}