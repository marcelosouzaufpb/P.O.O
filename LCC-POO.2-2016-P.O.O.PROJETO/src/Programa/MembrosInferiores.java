package Programa;

public class MembrosInferiores {
	private String nomeExcercicio01;
	private String serie01;
	private String rep01;
	private String carga01;
	
	public MembrosInferiores(){
		this.nomeExcercicio01 = "Sem nome ";
		this.serie01 = "Sem serie";
		this.rep01 = "Sem rep";
		this.carga01 = "Sem carga";
	}
	
	public MembrosInferiores(String nomeExcercicio01, String serie01, String rep01, String carga01) {
		super();
		this.nomeExcercicio01 = nomeExcercicio01;
		this.serie01 = serie01;
		this.rep01 = rep01;
		this.carga01 = carga01;
	}
	public String getNomeExcercicio01() {
		return nomeExcercicio01;
	}
	public void setNomeExcercicio01(String nomeExcercicio01) {
		this.nomeExcercicio01 = nomeExcercicio01;
	}
	public String getSerie01() {
		return serie01;
	}
	public void setSerie01(String serie01) {
		this.serie01 = serie01;
	}
	public String getRep01() {
		return rep01;
	}
	public void setRep01(String rep01) {
		this.rep01 = rep01;
	}
	public String getCarga01() {
		return carga01;
	}
	public void setCarga01(String carga01) {
		this.carga01 = carga01;
	}

	@Override
	public String toString() {
		return "MembrosInferiores [nomeExcercicio01=" + nomeExcercicio01 + ", serie01=" + serie01 + ", rep01=" + rep01
				+ ", carga01=" + carga01 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga01 == null) ? 0 : carga01.hashCode());
		result = prime * result + ((nomeExcercicio01 == null) ? 0 : nomeExcercicio01.hashCode());
		result = prime * result + ((rep01 == null) ? 0 : rep01.hashCode());
		result = prime * result + ((serie01 == null) ? 0 : serie01.hashCode());
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
		MembrosInferiores other = (MembrosInferiores) obj;
		if (carga01 == null) {
			if (other.carga01 != null)
				return false;
		} else if (!carga01.equals(other.carga01))
			return false;
		if (nomeExcercicio01 == null) {
			if (other.nomeExcercicio01 != null)
				return false;
		} else if (!nomeExcercicio01.equals(other.nomeExcercicio01))
			return false;
		if (rep01 == null) {
			if (other.rep01 != null)
				return false;
		} else if (!rep01.equals(other.rep01))
			return false;
		if (serie01 == null) {
			if (other.serie01 != null)
				return false;
		} else if (!serie01.equals(other.serie01))
			return false;
		return true;
	}
	
	
	
	

}
