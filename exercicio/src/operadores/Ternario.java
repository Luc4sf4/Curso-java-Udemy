package operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
	
		String resultadoFinal = media >7.0 ? 
				"Aprovado." : "Em recuperação.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? %s" + resultado);
		
	}

}
