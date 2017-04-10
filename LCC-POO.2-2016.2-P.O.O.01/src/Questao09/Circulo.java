package Questao09;

public class Circulo implements FormaGeometrica {
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculoDoPerimetro() {

		return (2 * 3.14) * this.raio;
	}

	@Override
	public double calculoDaAreaDaForma() {
		// TODO Auto-generated method stub
		return 0;
	}

}
