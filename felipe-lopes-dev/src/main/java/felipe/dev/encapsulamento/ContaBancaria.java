package felipe.dev.encapsulamento;

public class ContaBancaria {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor não pode ser menor ou igual a zero");
		}

		saldo += valor;

	}

	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor não pode ser menor ou igual a zero");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Valor não pode ser maior do que o saldo atual");
		}

		saldo -= valor;

	}

}
