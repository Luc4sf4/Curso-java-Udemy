package fundamentos;

public class NotacaPonto {
	public static void main(String[] args) {

		String s = "Bom Dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Lucas".toUpperCase();
		System.out.println(x);
		
		String y = "Bom Dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
