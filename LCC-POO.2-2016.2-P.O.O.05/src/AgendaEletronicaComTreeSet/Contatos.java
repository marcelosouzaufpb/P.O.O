package AgendaEletronicaComTreeSet;

public class Contatos implements Comparable<Contatos> {
	private String nome;
	private Integer numero;
	private String email;

	public Contatos(String nome, Integer numero, String email) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}

	public Contatos() {
		this.nome = "";
		this.numero = 0;
		this.email = "";
	}

	public int hashCode() {
		return this.numero;
	}

	public int compareTo(Contatos o) {
		return this.nome.compareTo(o.nome);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof Contatos) {
			Contatos c = (Contatos) obj;
			if (c.getNome().equals(this.nome) && c.getNumero().equals(this.numero) && c.getEmail().equals(this.email)) {
				return true;
			}
		}
		return false;
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

}
