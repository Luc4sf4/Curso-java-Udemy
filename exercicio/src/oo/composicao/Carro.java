package oo.composicao;

public class Carro {

	final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}

	void acelarar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estarLigado() {
		return motor.ligado;
	}

}
