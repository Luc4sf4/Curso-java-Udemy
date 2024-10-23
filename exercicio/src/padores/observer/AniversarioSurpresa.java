package padores.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Namorada namorada = new Namorada();
		
		Porteiro porteiro = new Porteiro();
		// porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			System.out.println("Supresa via lambda!");
			System.out.println("Ocorreu em : " + e.getMomento());
		});
		porteiro.monitorar();

	}

}
