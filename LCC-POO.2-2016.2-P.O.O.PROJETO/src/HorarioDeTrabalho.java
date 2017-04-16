
public class HorarioDeTrabalho {
	private String turno;
	private String horas;
	private String dia;

	public HorarioDeTrabalho(String turno, String horas, String dia) {
		super();
		this.turno = turno;
		this.horas = horas;
		this.dia = dia;
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

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}
