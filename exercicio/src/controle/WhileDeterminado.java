package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		//Usado para quando não temos um planejamento de repetição
		int contador = 0;
		while(contador >= 20){
			System.out.printf("i = %d\n", contador);
			contador += 2;
		}
		
		
//		Laço infinito
//		for(;;){
//			System.out.println("fim");
//		}
		
	}
}