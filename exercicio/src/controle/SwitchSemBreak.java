package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
	
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o TekkeiShodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian  Nidan");
		case "amarela":
			System.out.println("sei o Heian Shodan");
//		default:
//			System.out.println("Não sei nada");
		}
		
	}
}
