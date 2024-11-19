package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

//import br.com.cod3r.app.calculo.calculadora;

public class Teste {

	public static void main(String[] args) {
	
		
		Calculadora calc = ServiceLoader.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(2, 3, 4));

		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			fieldId.setAccessible(false);
			
			System.out.println(calc.getId());	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
