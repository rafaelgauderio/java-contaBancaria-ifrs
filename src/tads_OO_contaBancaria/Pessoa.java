package tads_OO_contaBancaria;

public class Pessoa {

	private String nome;
	private String endereco;
	private String cidade;
	private String bairro;
	private String estado;
	private int fone;
	private String email;
	private String CPF;
	private String RG;

	// Construtor vazio
	public Pessoa() {

	}

	// Construtor com argumentos
	public Pessoa(String nome, String endereco, String cidade, String bairro, String estado, int fone, String email,
			String CPF, String RG) {

		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.fone = fone;
		this.email = email;
		this.CPF = CPF;
		this.RG = RG;

	}

	// Metodos getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade + ", bairro=" + bairro
				+ ", estado=" + estado + "\nfone=" + fone + ", email=" + email + ", CPF=" + CPF + ", RG=" + RG + "]";

	}

}
