package controle;

public class Conitnue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				// continua o laço for e pula pro próximo
				continue;
			}
		}
		for (int i = 0; i <= 10; i++) {
			// continua o laço for e pula pro próximo
			if (i == 5)
				continue;
		}
	}

}
