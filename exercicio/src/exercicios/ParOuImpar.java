package exercicios;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
	
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = tcd.nextInt();

		if(numero % 2 == 0){
			System.out.println(numero + " Ele é par");
		}else{
			System.out.println(numero + " Ele é impar");
		}
		
		tcd.close();
		
	}
}
