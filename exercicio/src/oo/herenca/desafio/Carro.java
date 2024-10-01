package oo.herenca.desafio;

public class Carro {

	int velocidadeAtual;

	void acelerar() {
		velocidadeAtual += 5;
	}
	void frear() {
		if(velocidadeAtual >=0){
			velocidadeAtual -=5;
		}else{
			velocidadeAtual = 0;
		}
		
	}
	
	//Lembrete de quando for printar algo em numeros, criar um to String
	public String toString(){
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}

}
