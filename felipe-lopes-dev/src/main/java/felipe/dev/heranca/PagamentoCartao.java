package felipe.dev.heranca;

public class PagamentoCartao extends Pagamento {

	public PagamentoCartao(double valor) {
		super.valor = valor;
	}

	@Override
	public void efeturarPagamento() {
		System.out.println("Efetuando pagamento por Cartão no valor de: " + valor);
	}

}
