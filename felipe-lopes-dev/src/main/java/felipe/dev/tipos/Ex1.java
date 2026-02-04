package felipe.dev.tipos;

import java.math.BigDecimal;

public class Ex1 {

	public static void main(String[] args) {

		/* Tipos primitivos */
		int quantidade = 10;
		double preco = 19.90;
		boolean disponivel = true;
		char categoria = 'A';
		float valor = 2.0f;
		
		/*Classes Wrapper*/
		Integer quantidadew = -1;
		Double precow = 19.90;
		Boolean disponivelw = true; /*ele aceita true, false e null (3 formatos)*/
		Character categoriaw = 'A';
		Float valorw = 10.0f;
		BigDecimal juros = new BigDecimal(10); /*Valores precisão financeira*/
		String texto = "Alex Fernando";
		
		quantidade = quantidadew;
		
		System.out.println(quantidadew.intValue());
		
		StringBuilder sb = new StringBuilder();
		sb.append(" aula de java \n");
		sb.append(" com o alex \n");
		sb.append(" nas quarta-feia \n");
		
		System.out.println(sb.toString());
		
        
	}

}
