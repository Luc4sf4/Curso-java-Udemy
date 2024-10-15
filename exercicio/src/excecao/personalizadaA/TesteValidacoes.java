package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", -7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}

}
