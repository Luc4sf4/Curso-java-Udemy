package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {

		Scanner tcd = new Scanner(System.in);
		System.out.println("Digita a sua nota: ");
		double nota = tcd.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inválida!");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
		} else if (nota >= 6.1) {
			System.out.println("Conceito B");
		} else if (nota >= 4.1) {
			System.out.println("Conceito C");
		} else if (nota >= 4.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}

		tcd.close();
	}

}
