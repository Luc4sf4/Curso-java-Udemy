package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;

import br.com.cod3r.app.calculo.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;

//import br.com.cod3r.app.calculo.calculadora;

public class Teste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		System.out.println(calc.soma(2, 3, 4));

		OperacoesAritimeticas op = new OperacoesAritimeticas();
		System.out.println(op.soma(4, 5, 6));

		try {
			Field fieldId = Calculadora.class.getDeclaredFields()[0];
			fieldId.setAccessible(true);
			
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			
			fieldId.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();

	}

}
