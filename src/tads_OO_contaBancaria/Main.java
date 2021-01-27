package tads_OO_contaBancaria;

public class Main {

	public static void main(String[] args) {

		Pessoa joao = new Pessoa(null, null, null, null, null, 0, null, null, null);
		Conta conta01Joao = new Conta(joao, 0, 0, 0);
		Conta conta02Joao = new Conta(joao, 0,0,0);

		joao.setNome("Joao da Silva");
		joao.setEndereco("Rua da Silva, 345");
		joao.setCidade("Porto Alegre");
		joao.setBairro("Centro");
		joao.setEstado("Rio Grande do Sul");
		joao.setFone(945678933);
		joao.setEmail("joao@gmail.com");
		joao.setCPF("00102935119");
		joao.setRG("3084756839");
		
		conta01Joao.setNumero(1574);
		conta01Joao.setDigito(4);
		conta01Joao.setTitular(joao);
		
		conta02Joao.setNumero(7819);
		conta02Joao.setDigito(7);
		conta02Joao.setTitular(joao);	
		
		System.out.println(joao);
		System.out.println("\n" + conta01Joao);		

		conta01Joao.credita(10);
		System.out.println("\n" + conta01Joao);

		boolean saqueEfetuado;
		saqueEfetuado = conta01Joao.debita(80);

		if (saqueEfetuado == true) {
			System.out.println("\nSaque efetuado com sucesso!");
		} else {
			System.out.println("\nSaque não efetuado devido a insuficiência de saldo. Saldo: R$"
					+ String.format("%.2f", conta01Joao.getSaldo()));
		}

		conta01Joao.debita(3);
		System.out.println("\n" + conta01Joao);

	}

}
