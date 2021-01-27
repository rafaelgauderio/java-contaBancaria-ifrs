package tads_OO_contaBancaria;

public class Conta {

	private Pessoa titular;
	private int numero;
	private int digito;
	private float saldo;

	// Construtor vazio
	
	public Conta(Pessoa titular, int numero, int digito, float saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.digito = digito;
		this.saldo = saldo=0; //toda conta inicial saldo zero
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public float getSaldo() {
		return saldo;

	}
	
		
	/*
	 * Comenta o método, para o correntista não setar o proprio saldo movimentar a
	 * conta apenas pelos métodos debita e credita
	 * 
	 * public void setSaldo(float saldo) { this.saldo=saldo;
	 * 
	 * }
	 */
	
	public boolean debita(float valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
			
		} else {
			return false;
		}

	}

	public void credita(float valor) {
		this.saldo=this.saldo+ valor;	}
	
	@Override
	public String toString() {
		return "[Titular= " + titular + "\nDados da Conta Bancária [numero=" + numero + ", digito=" + digito + ", saldo= R$ " + String.format("%.2f", saldo)+ "]";
	}

}
