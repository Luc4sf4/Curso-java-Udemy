package observer;

public class Namorada implements ChegadaAniversarianteObserver{
	
	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apagar as luzes...");
		System.out.println("Fazer Silencio...");
		System.out.println("Surpresa!!!");
		
	}

}
