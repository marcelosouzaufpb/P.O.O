package Questao08;

public class Gerente extends Funcionario {
	private String area;

	public Gerente(String nome, Data nacimento, double salario) {
		super(nome, nacimento, salario);

	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double calculaImposto() {
		double imposto = (5 * super.getSalario()) / 100;
		return imposto;
	}

	public String imprimirDados() {

		return super.getNome() + "," + super.getSalario() + calculaImposto();
	}

}
