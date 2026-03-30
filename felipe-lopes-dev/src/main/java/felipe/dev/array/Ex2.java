package felipe.dev.array;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] valores = new int[5];

		for (int i = 0; i < valores.length; i++) {

			System.out.println("Digite o numero: " + (i + 1));
			valores[i] = sc.nextInt();

		}

		System.out.println("Numeros informados: ");
		for (int n : valores) {
			System.out.println(n);
		}

	}

}
