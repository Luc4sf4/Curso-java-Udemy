package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

//o que a julia pode acessar de ana ? 
public class Julia {
	
	void testeAcessos() {

		Ana sogra = new Ana();
		//System.out.println(esposa.segredo);// não pode acessar, é privado
		//System.out.println(sogra.facoDentroDeCasa);// visibilidade só dentro do pacote
		//System.out.println(sogra.formaDeFalar);//alem de não ser herdado, não está dentro do mesmo pacote
		System.out.println(sogra.todosSabem);// é publico
	}
	
	
	

}