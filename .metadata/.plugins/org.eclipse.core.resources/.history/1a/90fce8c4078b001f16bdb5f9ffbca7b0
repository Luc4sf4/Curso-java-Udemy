package excecao;

import java.util.Objects;

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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " tem nota " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, faltas, nome, nota, qtdTarefas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamento == other.bomComportamento && faltas == other.faltas && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota)
				&& qtdTarefas == other.qtdTarefas;
	}
	
	

}
