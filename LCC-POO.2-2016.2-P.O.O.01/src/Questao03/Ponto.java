package Questao03;

public class Ponto {
	protected double x;
	protected double y;

	public Ponto() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Ponto) {
			Ponto p = (Ponto) obj;
			if ((p.x == this.x) && (p.y == this.y)) {
				return true;
			}
		}
		return false;

	}
}
