package Programa;

public class Bicips {
	private String nomeExcercicio05;
	private String serie05;
	private String rep05;
	private String carga05;

	public Bicips() {
		this.nomeExcercicio05 = "Sem nome ";
		this.serie05 = "Sem serie";
		this.rep05 = "Sem rep";
		this.carga05 = "Sem carga";
	}

	public Bicips(String nomeExcercicio05, String serie05, String rep05, String carga05) {
		super();
		this.nomeExcercicio05 = nomeExcercicio05;
		this.serie05 = serie05;
		this.rep05 = rep05;
		this.carga05 = carga05;
	}

	public String getNomeExcercicio05() {
		return nomeExcercicio05;
	}

	public void setNomeExcercicio05(String nomeExcercicio05) {
		this.nomeExcercicio05 = nomeExcercicio05;
	}

	public String getSerie05() {
		return serie05;
	}

	public void setSerie05(String serie05) {
		this.serie05 = serie05;
	}

	public String getRep05() {
		return rep05;
	}

	public void setRep05(String rep05) {
		this.rep05 = rep05;
	}

	public String getCarga05() {
		return carga05;
	}

	public void setCarga05(String carga05) {
		this.carga05 = carga05;
	}

	@Override
	public String toString() {
		return "Bicips [nomeExcercicio05=" + nomeExcercicio05 + ", serie05=" + serie05 + ", rep05=" + rep05
				+ ", carga05=" + carga05 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga05 == null) ? 0 : carga05.hashCode());
		result = prime * result + ((nomeExcercicio05 == null) ? 0 : nomeExcercicio05.hashCode());
		result = prime * result + ((rep05 == null) ? 0 : rep05.hashCode());
		result = prime * result + ((serie05 == null) ? 0 : serie05.hashCode());
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
		Bicips other = (Bicips) obj;
		if (carga05 == null) {
			if (other.carga05 != null)
				return false;
		} else if (!carga05.equals(other.carga05))
			return false;
		if (nomeExcercicio05 == null) {
			if (other.nomeExcercicio05 != null)
				return false;
		} else if (!nomeExcercicio05.equals(other.nomeExcercicio05))
			return false;
		if (rep05 == null) {
			if (other.rep05 != null)
				return false;
		} else if (!rep05.equals(other.rep05))
			return false;
		if (serie05 == null) {
			if (other.serie05 != null)
				return false;
		} else if (!serie05.equals(other.serie05))
			return false;
		return true;
	}

}
