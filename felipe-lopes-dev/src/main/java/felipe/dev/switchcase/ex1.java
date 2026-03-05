package felipe.dev.switchcase;

public class ex1 {

	public static void main(String[] args) {

		int dia = 3; /* valor do banco de dados, da tela, de qualquer lugar */

		String nome = "";

		switch (dia) {
		case 1:
			nome = "Domingo";
			break;

		case 2:
			nome = "Segunda";
			break;
		case 3:
			nome = "Terça-feira";
			break;

		default:
			nome = "Desconhecido";

		}

		System.out.println("Dia da semana: " + nome);

		String nomeDia = switch (dia) {
			case 1 -> "Domingo";
			case 2 -> "Segunda";
			case 3 -> {
				dispararPromocao();
				yield "Terça-feira";
			}
			default -> "Desconhecido";
		};

		System.out.println("nomeDia : " + nomeDia);

	}

	public static void dispararPromocao() {
		System.out.println("disparo de promoção");
	}

}
