package Loop;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n = sc.nextDouble();
		
		if (n <= 10) {
		System.err.println("Número inválido.");
		} else if (n > 10 && n < 20) {
		 System.out.println("Número válido.");
		} else if (n >= 20 && n <= 30) {
		 System.out.println("Número válido.");
		} else if (n > 30 && n < 40) {
		 System.out.println("Número válido.");
		} else if (n >= 40) {
		 System.err.println("Número inválido.");
		}

		sc.close();
	}

}
