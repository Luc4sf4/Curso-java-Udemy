package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

// o que pedro pode acessar de ana ? 
public class Pedro extends Ana {

	void testeAcessos() {
//		 segredo
//		 facoDentroDeCasa
//		formaDeFalar 
//		todosSabem 

		// System.out.println(segredo);// não posso acessar, é privado
		// System.out.println(facoDentroDeCasa);// visibilidade só dentro do pacote da
		// casa A
		System.out.println(formaDeFalar);// recebido por herença logo não é necessário instancia
		System.out.println(new Ana().todosSabem);// é publico
	}

}
