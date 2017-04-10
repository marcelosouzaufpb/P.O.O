package AreaCalculada;

public class Retangulo implements AreaCalculavel {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public Retangulo() {
		this.altura = 4.0;
		this.largura = 2.0;
	}

	public double calculaArea() {

		return this.largura * this.altura;

	}

	public String toString() {
		return "Altura: " + this.altura + " Largura: " + this.largura + " Area do Retangulo.";
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (o instanceof Retangulo) {
			Retangulo r = (Retangulo) o;
			if (r.altura == this.altura) {
				return true;
			}
			if (r.largura == this.altura) {
				return true;
			}
		}
		return false;

	}

}
