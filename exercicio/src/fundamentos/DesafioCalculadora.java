package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número ");
		int num1 = tcd.nextInt();
		
		System.out.println("Informe o segundo número ");
		int num2 = tcd.nextInt();
		
		System.out.println("Qual a operação que vc deseja fazer ? ");
		
		System.out.println("'+' adição, subtração '-', multiplicação '*', divisão '/', modular '%' ");
		String sinal = tcd.next();
		
		double result = sinal.equals("+") ? num1 + num2 : 0;
		result = sinal.equals("-") ? num1 - num2 : result;
		result = sinal.equals("*") ? num1 * num2 : result;
		result = sinal.equals("/") ? num1 / num2 : result;
		result = sinal.equals("%") ? num1 % num2 : result;
		
		System.out.println("A resposta é " + result);
		
		tcd.close();
		
	}
	
}