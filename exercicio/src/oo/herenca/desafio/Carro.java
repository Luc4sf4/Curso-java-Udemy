package oo.herenca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;

	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}

	}

	public void frear() {
		if (velocidadeAtual >= 0) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}

	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	// Lembrete de quando for printar algo em numeros, criar um to String
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}

}
