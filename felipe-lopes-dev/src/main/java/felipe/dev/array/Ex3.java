package felipe.dev.array;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] valores = new int[5];

		for (int i = 0; i < valores.length; i++) {

			System.out.println("Digite o numero: " + (i + 1));
			valores[i] = sc.nextInt();

		}
		
		
		int  soma = 0;
		
		for (int numero : valores) {
			soma += numero;
		}
		
		System.out.println("Soma de tudo: " + soma);

	}

}
