package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro salário: ");
		String salario1 = tcd.next().replace(",", ".");
		
		System.out.println("Informe o valor do segundo salário: ");
		String salario2 = tcd.next().replace(",", ".");
		
		System.out.println("Informe o valor do terceiro salário: ");
		String salario3 = tcd.next().replace(",", ".");
		
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		double soma =  numero1 + numero2 + numero3;
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("A soma é:  " + soma);
		System.out.println("\nMédia salarial:  " + media);
		
		tcd.close();
	}
}
