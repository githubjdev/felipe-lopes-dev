package felipe.dev.switchcase;

public class EX2 {

	public static void main(String[] args) {
		StatusPedido statusPedido = StatusPedido.ENVIADO;

		String mensagem = "";

		switch (statusPedido) {
		case NOVO:
			mensagem = "Seu pedido foi recebido e está em analise";
			break;

		case ENVIADO:
			mensagem = "Seu pedido enviado";
			break;

		case ENTREGUE:
			mensagem = "Seu pedido foi entregue";
			break;
		}
		
		
		System.out.println("Resultado: " + mensagem);
	}

}
