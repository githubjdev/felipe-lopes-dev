package felipe.dev.whiledowhile;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nota = -1;

		/* Tem que ser informado valor entre 1 e 10 */
		while (nota < 0 || nota > 10) {
			System.out.println("Inform uma nota entre 1 e 10: ");
			nota = scanner.nextInt();
		}

		System.out.println("Nota válida: " + nota);
		scanner.close();

	}

}
