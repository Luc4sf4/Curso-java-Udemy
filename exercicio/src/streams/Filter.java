package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		//Desafio será filtrar por quantidades de tarefas feitas e faltas
		Aluno a1 = new Aluno("Ana", 7.8, 5, 3);
		Aluno a2 = new Aluno("Bia", 5.8, 10, 5);
		Aluno a3 = new Aluno("Daniel", 9.8, 7, 8);
		Aluno a4 = new Aluno("Gui", 6.8, 10, 0);
		Aluno a5 = new Aluno("Rebeca", 7.1, 10, 2);
		Aluno a6 = new Aluno("Pedro", 8.8, 2, 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + " ! está aprovado(a)";
		Predicate<Aluno> faltas = a -> a.faltas < 10;
		Predicate<Aluno> tarefasFeitas = a -> a.qtdTarefas > 2;
		
		alunos.stream()
		.filter(aprovado)
		.filter(faltas)
		.filter(tarefasFeitas)
		.map(saudacaoAprovado)
		.forEach(System.out::println);;

	}

}
