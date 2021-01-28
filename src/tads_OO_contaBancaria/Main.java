package tads_OO_contaBancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pessoa joao = new Pessoa(null, null, null, null, null, 0, null, null, null);
		Conta conta01Joao = new Conta(joao, 0, 0, 0);
		Conta conta02Joao = new Conta(joao, 0, 0, 0);
		List<Conta> lista = new ArrayList<Conta>();

		joao.setNome("Joao da Silva");
		joao.setEndereco("Rua da Silva, 345");
		joao.setCidade("Porto Alegre");
		joao.setBairro("Centro");
		joao.setEstado("RS");
		joao.setFone(945678933);
		joao.setEmail("joao@gmail.com");

		System.out.print("Informe um CPF válido:");
		String CPF=sc.next();					
		joao.setCPF(CPF);		
		
		if (ValidarCPF.validaCPF(CPF) == true) {

			System.out.println("Foi setado um CPF válido.\n");
			joao.setCPF(ValidarCPF.imprimeCPF(CPF));
		}

		else {
			joao.setCPF(null);
			System.out.println("Foi tentado setar um CPF inválido\n");
		}

		joao.setRG("3084756839");
		conta01Joao.setNumero(1574);
		conta01Joao.setDigito(4);
		conta01Joao.setTitular(joao);

		conta02Joao.setNumero(7819);
		conta02Joao.setDigito(7);
		conta02Joao.setTitular(joao);

		System.out.println("DADOS DO CLIENTE\n" + joao);
		
		System.out.println("\nDADOS DA CONTA CORRENTE");
		System.out.println(conta01Joao);

		conta01Joao.credita(10);
		conta02Joao.credita((float) 900.50);
		System.out.println("\n" + conta01Joao);

		boolean saqueEfetuado;
		System.out.println("\nTentativa de Saque de R$ 80,00");
		saqueEfetuado = conta01Joao.debita(80);

		if (saqueEfetuado == true) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saque não efetuado devido a insuficiência de saldo. Saldo: R$"
					+ String.format("%.2f", conta01Joao.getSaldo()));
		}

		conta01Joao.debita(3);
		lista.add(conta01Joao);
		lista.add(conta02Joao);

		System.out.println("\nO correntista " + joao.getNome() + " possui #" + lista.size()
				+ " contas bancarias com os dados abaixo:");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
		for (Conta apelido : lista) {

			System.out.println(apelido);
			System.out.println(
					"--------------------------------------------------------------------------------------------------------");
		}

		sc.close();

	}

}
