package exercicios;

import javax.swing.JOptionPane;

public class MediaCalc {
	public static void main(String[] args) {

		String Strnota1 = JOptionPane.showInputDialog("Insira a primeira nota ");
		String Strnota2 = JOptionPane.showInputDialog("Insira a segunda nota ");

		Double nota1 = Double.parseDouble(Strnota1);
		Double nota2 = Double.parseDouble(Strnota2);

		double media = (nota1 + nota2) / 2;

		if (media >= 7.0) {
			JOptionPane.showMessageDialog(null, Double.toString(media), "Aprovado :D", 0, null);
		} else if (media < 7.0 && media >= 4.0) {
			JOptionPane.showMessageDialog(null,Double.toString(media),"Recuperação, tem jeito ainda ;D", 0, null);
		} else {
			JOptionPane.showMessageDialog(null,Double.toString(media), "Reprovado :(", 0, null);
		}
	}
}
