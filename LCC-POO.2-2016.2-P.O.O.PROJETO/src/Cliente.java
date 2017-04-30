import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

public class Cliente {
	private Acesso acesso;
	private String turno;
	private double altura;
	private double peso;
	private String sexo;
	private List<Treino> diaDaSemana;

	public Cliente(Acesso acesso, String turno, double altura, double peso, String sexo) {
		this.acesso = acesso;
		this.turno = turno;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;

	}

	public void cadastraTreino(Treino t) {
		this.diaDaSemana.add(t);
	}

	public double imc() {
		return (this.peso / this.altura) * 2;
	}

	public String treinoDoDia(String dia) {
		for (Treino a : this.diaDaSemana) {
			if (a.getDia().equals(dia)) {
				return a.getTreino();
			}
		}
		return "Sem treino nesse dia";
	}

	public String treinoDaSemana() {
		String treino = "";
		for (Treino a : this.diaDaSemana) {
			treino += a.toString();
		}
		return treino;
	}

	public void alterarTreino(String dia) throws IOException{
		for (Treino a : this.diaDaSemana) {
			if(a.getDia().equals(dia)){
				String treino = JOptionPane.showInputDialog("Digite o novo treino ?");
				String musculo = JOptionPane.showInputDialog("Digite o novo musculo ?");
				a.setDia(dia);
				a.setTreino(treino);
				a.setMusculo(musculo);
				
			}
		}
		throw new IOException("Dia nao achado !!!");
		
	}

	public String toString() {
		return this.turno + ".\n" + this.altura + ".\n" + this.peso + ".\n" + this.sexo + ".";
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Treino> getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(List<Treino> diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acesso == null) ? 0 : acesso.hashCode());
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (acesso == null) {
			if (other.acesso != null)
				return false;
		} else if (!acesso.equals(other.acesso))
			return false;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (turno == null) {
			if (other.turno != null)
				return false;
		} else if (!turno.equals(other.turno))
			return false;
		return true;
	}

}
