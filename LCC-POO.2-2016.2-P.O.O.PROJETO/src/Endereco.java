
public class Endereco {
	private String cidade;
	private String bairro;
	private int numero;
	private String estado;
	private int cp;

	public Endereco() {
		this.cidade = "";
		this.bairro = "";
		this.numero = 0;
		this.estado = "";
		this.cp = 0;
	}

	public Endereco(String cidade, String bairro, int numero, String estado, int cp) {
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
		this.estado = estado;
		this.cp = cp;
	}

	public String toString() {
		return this.cidade + ", " + this.bairro + ", " + this.numero + ", " + this.estado + ", " + this.cp;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + cp;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + numero;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cp != other.cp)
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
