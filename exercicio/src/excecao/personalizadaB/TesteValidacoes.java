package excecao.personalizadaB;

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
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumeroForaIntervaloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim :)");
	}

}
