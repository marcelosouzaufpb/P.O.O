package Projeto;

import java.util.List;

public abstract class Funcionario extends Pessoa {
	private double salario;
	private List<CargaHoraria> horarioDeTrabalho;

	public abstract double calculaSalario(double salario, List<CargaHoraria> horarioDeTrabalho);

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<CargaHoraria> getHorarioDeTrabalho() {
		return horarioDeTrabalho;
	}

	public void setHorarioDeTrabalho(List<CargaHoraria> horarioDeTrabalho) {
		this.horarioDeTrabalho = horarioDeTrabalho;
	}

}
