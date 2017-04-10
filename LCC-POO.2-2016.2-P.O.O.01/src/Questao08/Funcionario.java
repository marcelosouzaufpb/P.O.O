package Questao08;

public class Funcionario extends Pessoa {

	private double salario;

	public Funcionario(String nome, Data nacimento, double salario) {
		super(nome, nacimento);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaImposto() {
		double imposto = (3 * this.salario) / 100;
		return imposto;
	}

	public String imprimirDados() {
		return super.getNome() + "," + this.salario + calculaImposto();
	}

	public String toString() {
		return super.getNome() + "," + super.getNacimento().toString() + "," + this.salario;
	}

}
