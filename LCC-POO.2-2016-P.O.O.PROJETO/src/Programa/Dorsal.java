package Programa;

public class Dorsal {
	private String nomeExcercicio04;
	private String serie04;
	private String rep04;
	private String carga04;

	public Dorsal() {
		this.nomeExcercicio04 = "Sem nome ";
		this.serie04 = "Sem serie";
		this.rep04 = "Sem rep";
		this.carga04 = "Sem carga";
	}

	public Dorsal(String nomeExcercicio04, String serie04, String rep04, String carga04) {
		super();
		this.nomeExcercicio04 = nomeExcercicio04;
		this.serie04 = serie04;
		this.rep04 = rep04;
		this.carga04 = carga04;
	}

	public String getNomeExcercicio04() {
		return nomeExcercicio04;
	}

	public void setNomeExcercicio04(String nomeExcercicio04) {
		this.nomeExcercicio04 = nomeExcercicio04;
	}

	public String getSerie04() {
		return serie04;
	}

	public void setSerie04(String serie04) {
		this.serie04 = serie04;
	}

	public String getRep04() {
		return rep04;
	}

	public void setRep04(String rep04) {
		this.rep04 = rep04;
	}

	public String getCarga04() {
		return carga04;
	}

	public void setCarga04(String carga04) {
		this.carga04 = carga04;
	}

	@Override
	public String toString() {
		return "Dorsal [nomeExcercicio04=" + nomeExcercicio04 + ", serie04=" + serie04 + ", rep04=" + rep04
				+ ", carga04=" + carga04 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga04 == null) ? 0 : carga04.hashCode());
		result = prime * result + ((nomeExcercicio04 == null) ? 0 : nomeExcercicio04.hashCode());
		result = prime * result + ((rep04 == null) ? 0 : rep04.hashCode());
		result = prime * result + ((serie04 == null) ? 0 : serie04.hashCode());
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
		Dorsal other = (Dorsal) obj;
		if (carga04 == null) {
			if (other.carga04 != null)
				return false;
		} else if (!carga04.equals(other.carga04))
			return false;
		if (nomeExcercicio04 == null) {
			if (other.nomeExcercicio04 != null)
				return false;
		} else if (!nomeExcercicio04.equals(other.nomeExcercicio04))
			return false;
		if (rep04 == null) {
			if (other.rep04 != null)
				return false;
		} else if (!rep04.equals(other.rep04))
			return false;
		if (serie04 == null) {
			if (other.serie04 != null)
				return false;
		} else if (!serie04.equals(other.serie04))
			return false;
		return true;
	}

}
