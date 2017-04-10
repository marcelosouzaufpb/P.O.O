package AreaCalculada;

public class Circulo implements AreaCalculavel {

	private double rai;

	public Circulo(double rai) {
		this.rai = rai;
	}

	public Circulo() {
		this.rai = 3.0;
	}

	public double calculaArea() {

		return this.rai * (3.14);
	}

	public String toString() {
		return "Rai " + this.rai + " Area do Circulo.";
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof Circulo) {
			Circulo c = (Circulo) o;
			if (c.rai == this.rai) {
				return true;
			}
		}
		return false;

	}

}
