package felipe.dev.heranca;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String rg;
	private String cnh;
	private String cartaoSus;
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCartaoSus() {
		return cartaoSus;
	}

	public void setCartaoSus(String cartaoSus) {
		this.cartaoSus = cartaoSus;
	}
	
	
	@Override
	public void enviar() {
		System.out.println("Enviando e-mail pessoa Fisica");
	}
}
