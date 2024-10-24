package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private int idade;

	public Pessoa(String nome,String sobreNome ,int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);
	}

	//getter
	public int getIdade() {
		return idade;
	}

	//setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade<= 120) {
			this.idade = novaIdade;
		}
	}
	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() +" ano";
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getNomeCompleto(){
		return getNome() + " " + getSobreNome();
	}
}
