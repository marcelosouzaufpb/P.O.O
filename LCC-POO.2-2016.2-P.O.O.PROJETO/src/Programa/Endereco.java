package Programa;

public class Endereco {
	private String rua;
	private String cidade;
	private String bairro;
	private String numeroDaCasa;
	
	public Endereco(){
		this.rua = "sem rua";
		this.cidade = "sem cidade";
		this.bairro = "sem bairro";
		this.numeroDaCasa = "sem numero da casa";
	}

	public Endereco(String rua, String cidade, String bairro, String numeroDaCasa) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numeroDaCasa = numeroDaCasa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
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

	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}

	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + ", bairro=" + bairro + ", numeroDaCasa=" + numeroDaCasa
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((numeroDaCasa == null) ? 0 : numeroDaCasa.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		if (numeroDaCasa == null) {
			if (other.numeroDaCasa != null)
				return false;
		} else if (!numeroDaCasa.equals(other.numeroDaCasa))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}

}
