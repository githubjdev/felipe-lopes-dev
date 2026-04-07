package felipe.dev.encapsulamento;

public class ContaBancariaMain {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		System.out.println("Saldo atual: " + bancaria.getSaldo());

		bancaria.depositar(500);

		System.out.println("Saldo atual: " + bancaria.getSaldo());

		bancaria.sacar(700);

		System.out.println("Saldo atual: " + bancaria.getSaldo());

	}

}
