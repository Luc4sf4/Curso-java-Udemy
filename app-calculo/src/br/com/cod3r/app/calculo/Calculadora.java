package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;
import br.com.cod3r.app.loggin.Logger;

public class Calculadora {
	
	private String id = "abc";
	
	private OperacoesAritimeticas opAritmeticas = new OperacoesAritimeticas();
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
	
}
