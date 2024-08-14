package controle;

public class Break {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			if(i == 5){
				//interrompe o laço for
				break;
			}
		System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
