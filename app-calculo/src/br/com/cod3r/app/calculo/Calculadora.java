package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;

public class Calculadora {
	
	private OperacoesAritimeticas opAritmeticas = new OperacoesAritimeticas();
	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
}
