package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//if(...) setença; ou {}
		//while(....) setença; ou {}
		//for(...;...;...) setença; ou {}
		
		//do senteça ou {} while(...);
		
		Scanner tcd = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas: ");
			System.out.println("Quer sair? ");
			
			texto = tcd.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado! ");
		
		tcd.close();
		
	}

}
