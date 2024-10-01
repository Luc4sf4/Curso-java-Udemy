package oo.herenca;

public class Jogo {
	public static void main(String[] args) {
		
		//Classe filha de jogador
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		//Classe filha de jogador
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		
		System.out.println("Monstro antes do ataque " + monstro.vida);
		System.out.println("Heroi antes do ataque " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro depois do ataque " + monstro.vida);
		System.out.println("Heroi depois do ataque " + heroi.vida);
	}

}