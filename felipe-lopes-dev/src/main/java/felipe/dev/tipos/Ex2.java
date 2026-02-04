package felipe.dev.tipos;

import felipe.dev.model.Produto;

public class Ex2 {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.setId(10L);
		produto.setNome("Mouse");
		produto.setValor(50.0);
		produto.setEstoque(200);

		System.out.println("ID: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Valor R$ : " + produto.getValor());
		System.out.println("Estoque: " + produto.getEstoque());

	}

}
