package oo.encapsulamento.casaA;

//o que paulo pode acessar de Ana ? 
public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {

		//System.out.println(esposa.segredo);// não posso acessar, é privado
		System.out.println(esposa.facoDentroDeCasa);// visibilidade só dentro do pacote
		System.out.println(esposa.formaDeFalar);//alem de poder  ser herdado, está dentro do mesmo pacote
		System.out.println(esposa.todosSabem);// é publico
	}

}
