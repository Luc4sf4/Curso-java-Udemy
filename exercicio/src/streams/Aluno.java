package streams;

public class Aluno {
	
	final String nome;
	final double nota;
	final int qtdTarefas;
	final int faltas;
	final boolean bomComportamento;
	
	
	public Aluno(String nome, double nota) {
		this(nome, nota, 0, 0, true);
		
	}
	
	public Aluno(String nome, double nota, int qtdTarefas, int faltas, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.qtdTarefas = qtdTarefas;
		this.faltas = faltas;
		this.bomComportamento = bomComportamento;		
	}

}
