package Programa;

public class Triceps {
	private String nomeExcercicio06;
	private String serie06;
	private String rep06;
	private String carga06;

	public Triceps() {
		this.nomeExcercicio06 = "Sem nome ";
		this.serie06 = "Sem serie";
		this.rep06 = "Sem rep";
		this.carga06 = "Sem carga";
	}

	public Triceps(String nomeExcercicio06, String serie06, String rep06, String carga06) {
		super();
		this.nomeExcercicio06 = nomeExcercicio06;
		this.serie06 = serie06;
		this.rep06 = rep06;
		this.carga06 = carga06;
	}

	public String getNomeExcercicio06() {
		return nomeExcercicio06;
	}

	public void setNomeExcercicio06(String nomeExcercicio06) {
		this.nomeExcercicio06 = nomeExcercicio06;
	}

	public String getSerie06() {
		return serie06;
	}

	public void setSerie06(String serie06) {
		this.serie06 = serie06;
	}

	public String getRep06() {
		return rep06;
	}

	public void setRep06(String rep06) {
		this.rep06 = rep06;
	}

	public String getCarga06() {
		return carga06;
	}

	public void setCarga06(String carga06) {
		this.carga06 = carga06;
	}

	@Override
	public String toString() {
		return "Triceps [nomeExcercicio06=" + nomeExcercicio06 + ", serie06=" + serie06 + ", rep06=" + rep06
				+ ", carga06=" + carga06 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga06 == null) ? 0 : carga06.hashCode());
		result = prime * result + ((nomeExcercicio06 == null) ? 0 : nomeExcercicio06.hashCode());
		result = prime * result + ((rep06 == null) ? 0 : rep06.hashCode());
		result = prime * result + ((serie06 == null) ? 0 : serie06.hashCode());
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
		Triceps other = (Triceps) obj;
		if (carga06 == null) {
			if (other.carga06 != null)
				return false;
		} else if (!carga06.equals(other.carga06))
			return false;
		if (nomeExcercicio06 == null) {
			if (other.nomeExcercicio06 != null)
				return false;
		} else if (!nomeExcercicio06.equals(other.nomeExcercicio06))
			return false;
		if (rep06 == null) {
			if (other.rep06 != null)
				return false;
		} else if (!rep06.equals(other.rep06))
			return false;
		if (serie06 == null) {
			if (other.serie06 != null)
				return false;
		} else if (!serie06.equals(other.serie06))
			return false;
		return true;
	}

}
