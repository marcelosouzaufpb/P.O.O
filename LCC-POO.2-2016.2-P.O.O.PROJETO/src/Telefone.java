
public class Telefone {
	private String operadora;
	private int prefixo;
	private int numero;

	public Telefone() {
		this.operadora = "";
		this.prefixo = 0;
		this.numero = 0;
	}

	public Telefone(String operadora, int prefixo, int numero) {
		this.operadora = operadora;
		this.prefixo = prefixo;
		this.numero = numero;
	}

	public String toString() {
		return "Telefone: " + this.operadora + ", (" + this.prefixo + ") -" + this.numero + ".";

	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public int getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + ((operadora == null) ? 0 : operadora.hashCode());
		result = prime * result + prefixo;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (numero != other.numero)
			return false;
		if (operadora == null) {
			if (other.operadora != null)
				return false;
		} else if (!operadora.equals(other.operadora))
			return false;
		if (prefixo != other.prefixo)
			return false;
		return true;
	}

}
