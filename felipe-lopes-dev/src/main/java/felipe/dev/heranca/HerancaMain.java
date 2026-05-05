package felipe.dev.heranca;

public class HerancaMain {

	public static void main(String[] args) {
          PessoaFisica pessoaFisica = new PessoaFisica();
          pessoaFisica.setCartaoSus("5565656565");
          pessoaFisica.setCnh("8476884564");
          pessoaFisica.setContatoRecado("Jose (Pai)");
          pessoaFisica.setCpf("4787488787");
          pessoaFisica.setEmail("paulo@gmail.com");
          pessoaFisica.setEndereco("Rua das dores, 356");
          pessoaFisica.setNome("Paulo jhose da silva");
          pessoaFisica.setRg("86654564665654");
          pessoaFisica.setTelefone("45 99 8898988");
          pessoaFisica.enviar();
          
          /*Aqui salvaria no banco de dados*/
          
          PessoaJuridica pessoaJuridica = new PessoaJuridica();
          pessoaJuridica.setCnae("8915000");
          pessoaJuridica.setCnpj("4545445445-0001/4555");
          pessoaJuridica.setContatoRecado("Marcia do financeiro");
          pessoaJuridica.setEmail("copacol@gmail.com");
          pessoaJuridica.setEndereco("Rua das graçcas, 788");
          pessoaJuridica.setInscricaoEstadual("455464665");
          pessoaJuridica.setInscricaoMunicipal("5465446464");
          pessoaJuridica.setNome("Jose pereira da costa");
          pessoaJuridica.setRegimeTributario("Simples Nacional");
          pessoaJuridica.setTelefone("545456464654");
          pessoaJuridica.enviar();
          
          /*Salvaria no banco de dados*/
          
	}

}
