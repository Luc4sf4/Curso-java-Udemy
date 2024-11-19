package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;
import br.com.cod3r.app.loggin.Logger;

public class CalculadoraImpl implements Calculadora{
	
	private String id = "abc";
	
	private OperacoesAritimeticas opAritmeticas = new OperacoesAritimeticas();
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
