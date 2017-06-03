package Programa;

public class Peitoral {
	private String nomeExcercicio03;
	private String serie03;
	private String rep03;
	private String carga03;

	public Peitoral() {
		this.nomeExcercicio03 = "Sem nome ";
		this.serie03 = "Sem serie";
		this.rep03 = "Sem rep";
		this.carga03 = "Sem carga";
	}

	public Peitoral(String nomeExcercicio03, String serie03, String rep03, String carga03) {
		super();
		this.nomeExcercicio03 = nomeExcercicio03;
		this.serie03 = serie03;
		this.rep03 = rep03;
		this.carga03 = carga03;
	}

	public String getNomeExcercicio03() {
		return nomeExcercicio03;
	}

	public void setNomeExcercicio03(String nomeExcercicio03) {
		this.nomeExcercicio03 = nomeExcercicio03;
	}

	public String getSerie03() {
		return serie03;
	}

	public void setSerie03(String serie03) {
		this.serie03 = serie03;
	}

	public String getRep03() {
		return rep03;
	}

	public void setRep03(String rep03) {
		this.rep03 = rep03;
	}

	public String getCarga03() {
		return carga03;
	}

	public void setCarga03(String carga03) {
		this.carga03 = carga03;
	}

	@Override
	public String toString() {
		return "Peitoral [nomeExcercicio03=" + nomeExcercicio03 + ", serie03=" + serie03 + ", rep03=" + rep03
				+ ", carga03=" + carga03 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga03 == null) ? 0 : carga03.hashCode());
		result = prime * result + ((nomeExcercicio03 == null) ? 0 : nomeExcercicio03.hashCode());
		result = prime * result + ((rep03 == null) ? 0 : rep03.hashCode());
		result = prime * result + ((serie03 == null) ? 0 : serie03.hashCode());
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
		Peitoral other = (Peitoral) obj;
		if (carga03 == null) {
			if (other.carga03 != null)
				return false;
		} else if (!carga03.equals(other.carga03))
			return false;
		if (nomeExcercicio03 == null) {
			if (other.nomeExcercicio03 != null)
				return false;
		} else if (!nomeExcercicio03.equals(other.nomeExcercicio03))
			return false;
		if (rep03 == null) {
			if (other.rep03 != null)
				return false;
		} else if (!rep03.equals(other.rep03))
			return false;
		if (serie03 == null) {
			if (other.serie03 != null)
				return false;
		} else if (!serie03.equals(other.serie03))
			return false;
		return true;
	}

}
