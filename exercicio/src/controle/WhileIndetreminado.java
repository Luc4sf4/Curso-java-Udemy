package controle;

import java.util.Scanner;

public class WhileIndetreminado {
	
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in); 
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
		System.out.println("Você diz: ");
		valor = tcd.nextLine();
			
		}
		
		tcd.close();
	}

}
