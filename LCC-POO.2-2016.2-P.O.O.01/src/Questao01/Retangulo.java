package Questao01;

public class Retangulo {
	private int largura;
	private int altura;

	public Retangulo() {
		this.largura = 0;
		this.altura = 0;
	}

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public boolean equals(int largura, int altura) {
		if ((this.getLargura() == largura) && (this.getAltura() == altura)) {
			return true;
		} else
			return false;

	}

	public int perimetro() {
		return (2 * this.largura) + (2 * this.altura);
	}

	public int area() {
		return this.largura * this.altura;
	}

	public String toString() {
		return "Altura: " + this.getAltura() + ", Largura: " + this.getLargura() + "\nPerimetro: " + perimetro()
				+ ", Area: " + area();
	}
}
