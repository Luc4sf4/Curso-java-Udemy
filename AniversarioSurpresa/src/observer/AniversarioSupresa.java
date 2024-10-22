package observer;

public class AniversarioSupresa {
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.addChegadaAniversarianteObserver(namorada);
		
		porteiro.start();
	}

}
