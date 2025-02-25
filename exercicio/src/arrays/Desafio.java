package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		
		int qtdeNotas = tcd.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota "+ (i + 1) + ": ");
			notas[i] = tcd.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		System.out.println("A média é " + media);	
		tcd.close();
	}
}
