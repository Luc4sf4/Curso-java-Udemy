package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.dia = 1;
		d1.mes = 8;
		d1.ano = 2024;
		
		System.out.printf("Hoje a data de hoje é: %d/%d/%d", d1.dia, d1.mes, d1.ano);
		
	}
}
