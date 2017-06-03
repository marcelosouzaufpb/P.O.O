package Programa;

public class Ombros {
	private String nomeExcercicio02;
	private String serie02;
	private String rep02;
	private String carga02;

	public Ombros() {
		this.nomeExcercicio02 = "Sem nome ";
		this.serie02 = "Sem serie";
		this.rep02 = "Sem rep";
		this.carga02 = "Sem carga";
	}

	public Ombros(String nomeExcercicio02, String serie02, String rep02, String carga02) {
		super();
		this.nomeExcercicio02 = nomeExcercicio02;
		this.serie02 = serie02;
		this.rep02 = rep02;
		this.carga02 = carga02;
	}

	public String getNomeExcercicio02() {
		return nomeExcercicio02;
	}

	public void setNomeExcercicio02(String nomeExcercicio02) {
		this.nomeExcercicio02 = nomeExcercicio02;
	}

	public String getSerie02() {
		return serie02;
	}

	public void setSerie02(String serie02) {
		this.serie02 = serie02;
	}

	public String getRep02() {
		return rep02;
	}

	public void setRep02(String rep02) {
		this.rep02 = rep02;
	}

	public String getCarga02() {
		return carga02;
	}

	public void setCarga02(String carga02) {
		this.carga02 = carga02;
	}

	@Override
	public String toString() {
		return "Ombros [nomeExcercicio02=" + nomeExcercicio02 + ", serie02=" + serie02 + ", rep02=" + rep02
				+ ", carga02=" + carga02 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga02 == null) ? 0 : carga02.hashCode());
		result = prime * result + ((nomeExcercicio02 == null) ? 0 : nomeExcercicio02.hashCode());
		result = prime * result + ((rep02 == null) ? 0 : rep02.hashCode());
		result = prime * result + ((serie02 == null) ? 0 : serie02.hashCode());
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
		Ombros other = (Ombros) obj;
		if (carga02 == null) {
			if (other.carga02 != null)
				return false;
		} else if (!carga02.equals(other.carga02))
			return false;
		if (nomeExcercicio02 == null) {
			if (other.nomeExcercicio02 != null)
				return false;
		} else if (!nomeExcercicio02.equals(other.nomeExcercicio02))
			return false;
		if (rep02 == null) {
			if (other.rep02 != null)
				return false;
		} else if (!rep02.equals(other.rep02))
			return false;
		if (serie02 == null) {
			if (other.serie02 != null)
				return false;
		} else if (!serie02.equals(other.serie02))
			return false;
		return true;
	}

}
