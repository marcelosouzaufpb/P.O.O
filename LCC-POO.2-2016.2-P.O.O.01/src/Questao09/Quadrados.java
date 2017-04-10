package Questao09;

public class Quadrados implements FormaGeometrica {
	private double lado;

	public Quadrados(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calculoDoPerimetro() {

		return this.lado * 4;
	}

	public double calculoDaAreaDaForma() {

		return this.lado * this.lado;
	}

}
