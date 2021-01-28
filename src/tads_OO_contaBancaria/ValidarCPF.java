package tads_OO_contaBancaria;

import java.util.InputMismatchException;

public class ValidarCPF {

	public static boolean validaCPF(String CPF) {

		// CPF é formado por 11 digitos e são verificados 2 digitos
		// erro se CPF por sequência de digitos iguais
		if (CPF.length() != 11 || CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("7777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999")) 
			return(false);
		

		char dig10, dig11;
		int soma, i, resto, num, peso;

		try {
			// Calculo do primeiro dígito verificador
			// converte caractere CPF em inteiro. Tabela ASCII: 48 = '0'
			soma = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				num = (int)(CPF.charAt(i) - 48);
				soma = soma +  (num * peso);
				peso = peso -1;
			}

			resto = 11 - (soma % 11);
			if ((resto == 10) || (resto == 11)) {
				dig10 = '0';
			} else {
				dig10 = (char) (resto + 48);
			}

			// Calculo do segundo dígito verificador

			soma = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				soma = soma +  (num * peso);
				peso = peso-1;
			}

			resto = 11 - (soma % 11);
			if ((resto == 10 || resto == 11)) {
				dig11 = '0';
			} else {
				dig11 = (char) (resto + 48);
			}

			// Verificar se os digitos calculados são os mesmos que os digitos informados

			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
				return(true);
			} else {
				return false;
			}
		} catch (InputMismatchException erro) {

			System.out.println(erro.getMessage());
			return(false);
		}
	}	

	public static String imprimeCPF(String CPF) {
		// na funcao substring tem que informar o indice de inicio e final como
		// parâmetro. Imprime no formato 000.000.000-00
		return (CPF.substring(0, 3) + "." + CPF.subSequence(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}
}
