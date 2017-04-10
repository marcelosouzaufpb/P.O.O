package Questao09;

public class Retangulo implements FormaGeometrica {
	private double tamanho;
	private double base;

	public Retangulo(double tamanho, double base) {
		this.tamanho = tamanho;
		this.base = base;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double calculoDoPerimetro() {

		return (this.base * 2) + (this.tamanho * 2);
	}

	public double calculoDaAreaDaForma() {

		return this.base * this.tamanho;
	}

}
