package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);

		System.out.println("Digite o dia da semana");
		String semana = tcd.next();

		// Nota: não usar comparação em método String
		// Use o .equals
		if (semana.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (semana.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (semana.equalsIgnoreCase("terça")||semana.equalsIgnoreCase("terça") ) {
			System.out.println(3);
		} else if (semana.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (semana.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (semana.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (semana.equalsIgnoreCase("sábado")||semana.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}else{
			System.out.println("Dia inválido");
		}

		tcd.close();
	}
}
