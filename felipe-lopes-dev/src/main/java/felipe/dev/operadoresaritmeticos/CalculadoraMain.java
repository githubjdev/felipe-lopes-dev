package felipe.dev.operadoresaritmeticos;

import java.util.Scanner;

public class CalculadoraMain {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o numero 1");
		double num1 = scanner.nextDouble();
		
		System.out.println("Informe o numero 2");
		double num2 = scanner.nextDouble();
		
		double soma = calculadora.somar(num1, num2);
		double subtracao = calculadora.subtracao(num1, num2);
		double multiplicaco = calculadora.multiplicaco(num1, num2);
		double divisao = calculadora.divisao(num1, num2);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		System.out.println("Multiplicaco: " + multiplicaco);
		System.out.println("Divisao: " + divisao);
		
		System.out.println("Informe o numero para saber se é divisivel por 2");
		double numMod = scanner.nextDouble();
		boolean mod = calculadora.mod(numMod);
		System.out.println("Mod: " + mod);
		
		
		scanner.close();
		
	}

}
