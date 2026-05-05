package felipe.dev.heranca;

public class PagamentoMain {
	
	
	public static void main(String[] args) {
		PagamentoCartao cartao = new PagamentoCartao(500.00);
		cartao.efeturarPagamento();
		
		
		PagamentoPIX pix = new PagamentoPIX(600.00);
		pix.efeturarPagamento();
	}

}
