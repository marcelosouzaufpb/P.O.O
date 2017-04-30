import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HorarioEDiaDeTrabalho {
	private List<String> diasDaSemana;
	private List<Double> horasDia;

	public HorarioEDiaDeTrabalho() {
		this.diasDaSemana = new ArrayList<String>(6);
		this.horasDia = new ArrayList<Double>(8);
	}

	public HorarioEDiaDeTrabalho(List<String> diasDaSemana, List<Double> horasDia) {
		this.diasDaSemana = new ArrayList<String>(6);
		this.horasDia = new ArrayList<Double>(8);
	}

	public void quantidadesDeHorasTrabalhadas(int numero01, int numero02) throws IOException {
		if ((numero01 + numero02) <= 8 && (numero01 + numero02) >= 0) {
			for (int k = 0; k < (numero01 + numero02); k++) {
				this.horasDia.add(1.0);
			}

		} else {
			throw new IOException("Numero de horas nao confere !!!");
		}

	}

	public void cargaDeHorasDia(String dia, List<Double> horasDia) {
		double horasTrabalhadas = 0.0;
		for (Double h : this.horasDia) {
			if (h != null) {
				horasTrabalhadas++;
			}
		}
		this.diasDaSemana.add(dia + "," + horasTrabalhadas);
	}

	public String toString() {
		String dia = "";
		for (String s : this.diasDaSemana) {
			dia += s + "\n";
		}
		return dia;
	}

	public List<String> getDiasDaSemana() {
		return diasDaSemana;
	}

	public void setDiasDaSemana(List<String> diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}

	public List<Double> getHorasDia() {
		return horasDia;
	}

	public void setHorasDia(List<Double> horasDia) {
		this.horasDia = horasDia;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diasDaSemana == null) ? 0 : diasDaSemana.hashCode());
		result = prime * result + ((horasDia == null) ? 0 : horasDia.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HorarioEDiaDeTrabalho other = (HorarioEDiaDeTrabalho) obj;
		if (diasDaSemana == null) {
			if (other.diasDaSemana != null)
				return false;
		} else if (!diasDaSemana.equals(other.diasDaSemana))
			return false;
		if (horasDia == null) {
			if (other.horasDia != null)
				return false;
		} else if (!horasDia.equals(other.horasDia))
			return false;
		return true;
	}

}
