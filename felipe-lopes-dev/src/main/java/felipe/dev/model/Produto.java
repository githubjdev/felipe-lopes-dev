package felipe.dev.model;

/*Classe java 99% das vezes ela irá se tornar um objeto pra uso dentro do sistema */
public class Produto {

	private Long id;
	private String nome;
	private double valor;
	private double estoque; /* 1.0, 10.0, 20.56 (metros quadrados) */

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}

	public double getEstoque() {
		return estoque;
	}

}
