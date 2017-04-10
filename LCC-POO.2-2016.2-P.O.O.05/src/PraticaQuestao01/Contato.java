package PraticaQuestao01;

public class Contato {
	private String nome;
	private Integer numero;
	private String email;

	public Contato(String nome, Integer numero, String email) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}

	public Contato() {
		this.nome = "";
		this.numero = 0;
		this.email = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof Contato) {
			Contato c = (Contato) obj;
			if (c.getNome().equals(this.nome) && c.getNumero().equals(this.numero) && c.getEmail().equals(this.email)) {
				return true;
			}
		}
		return false;
	}

}
