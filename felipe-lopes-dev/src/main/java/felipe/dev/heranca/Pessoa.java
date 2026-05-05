package felipe.dev.heranca;

public class Pessoa {

	private Long id;
	private String nome;
	private String telefone;
	private String endereco;
	private String contatoRecado;
	private String email;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContatoRecado() {
		return contatoRecado;
	}

	public void setContatoRecado(String contatoRecado) {
		this.contatoRecado = contatoRecado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void enviar() {
		System.out.println("Enviando e-mail.....");
	}

}
