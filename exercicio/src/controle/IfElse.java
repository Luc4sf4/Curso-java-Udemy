package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		//se numero tiver o resto da divisão for igual a zero
		//% módulo seria o resto da divisião
		// os "==" é de comparação
		if(numero % 2 == 0){
			System.out.println("Número é par");
		}else{
			System.out.println("Número é impar");
		}
		
	}
}
