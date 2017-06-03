package Programa;

public class Telefone {
	private String numero;
	private String dd;

	public Telefone(String numero, String dd) {
		super();
		this.numero = numero;
		this.dd = dd;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", dd=" + dd + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dd == null) ? 0 : dd.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (dd == null) {
			if (other.dd != null)
				return false;
		} else if (!dd.equals(other.dd))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
