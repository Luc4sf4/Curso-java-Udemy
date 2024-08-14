package exercicios;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("informe o ano: ");
		double ano = tcd.nextDouble();
		
		if(ano % 4 == 0){
			System.out.println("Ano bissexto");
		}else {
			System.out.println("Ano não bissexto");
		}
		
		tcd.close();
		
	}
	

}
