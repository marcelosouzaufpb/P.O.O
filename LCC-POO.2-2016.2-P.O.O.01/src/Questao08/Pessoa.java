package Questao08;

public abstract class Pessoa {
	public abstract String imprimirDados();

	private String nome;
	private Data nacimento;

	public Pessoa(String nome, Data nacimento) {
		this.setNome(nome);
		this.setNacimento(nacimento);
	}

	public Pessoa() {
		this.setNome("");
		this.setNacimento(null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getNacimento() {
		return nacimento;
	}

	public void setNacimento(Data nacimento) {
		this.nacimento = nacimento;
	}

	public String toString() {
		return this.nome + " " + this.nacimento.toString();
	}

}
