
public class DataAniversario {
	private int dia;
	private int mes;
	private int ano;

	public DataAniversario() {
		this.setDia(0);
		this.setMes(0);
		this.setAno(0);
	}

	public DataAniversario(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof DataAniversario) {
			DataAniversario d = (DataAniversario) obj;
			if ((d.getDia() == this.dia) && (d.getMes() == this.mes) && (d.getAno() == this.ano)) {
				return true;
			}
		}
		return false;

	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
