package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
	
		//usuario vai digitar uma nota 
		//armazenar 
		
		Scanner tcd = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total =0;
		
		while(nota != -1){
			System.out.print("Informe a nota : ");
			nota = tcd.nextDouble();
			if(nota <= 10 && nota>= 0) {
				total += nota;
				quantidadeDeNotas++;
			}else if(nota!= -1){
				System.out.println("NOta inválida!! ");
			}
			
		}
		
		double media = total/ quantidadeDeNotas;
		System.out.println("Média = " + media );
		
		
		tcd.close();
		
	}
}
