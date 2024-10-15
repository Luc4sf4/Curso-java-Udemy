package excecao.personalizadaB;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner tcd = new Scanner(System.in);
		try {
			System.out.println(7 / tcd.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally #01...");
			
		}

		try {
			System.out.println(7 / tcd.nextInt());
		} finally {
			System.out.println("Finally #02...");
			tcd.close();
		}

		System.out.println("Fim!");
	}

}
