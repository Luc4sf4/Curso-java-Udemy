package padores.observer;

public class Namorada implements ChegadaAniversarianteObservador{
	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperaer um pouco...");
		System.out.println("e... surpresa!!!!");
		
		
	}

}
