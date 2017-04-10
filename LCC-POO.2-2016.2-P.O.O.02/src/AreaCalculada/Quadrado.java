package AreaCalculada;

public class Quadrado implements AreaCalculavel {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public Quadrado() {
		this.lado = 5.5;
	}

	public double calculaArea() {

		return this.lado * this.lado;
	}

	public String toString() {
		return "Lado: " + this.lado + " Area do Quadrado. ";
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;

		} else if (o instanceof Quadrado) {
			Quadrado q = (Quadrado) o;

			if (q.lado == this.lado) {
				return true;
			}

		}
		return false;

	}

}
