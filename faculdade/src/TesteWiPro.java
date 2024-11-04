
public class TesteWiPro {
	public static void main(String[] args) {
		
		double numberCard = 123456;
		double money = 5000;
		
		if(numberCard == 123456 && money >= 5000){
			
			double result = money - 5000;
			
			System.out.println("Your acount was" + result);
		}else {
			
			System.out.println("You don't have that amount");
		}
		
		
		
	}

}
