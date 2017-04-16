import java.util.List;

public class TreinosDaSemana {
	private String turno;
	private String horas;
	private List<String> exercicios;

	public TreinosDaSemana(String turno, String horas, List<String> exercicios) {
		this.turno = turno;
		this.horas = horas;
		this.exercicios = exercicios;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public List<String> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<String> exercicios) {
		this.exercicios = exercicios;
	}

}
