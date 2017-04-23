package Questao04;

public class Codigo<X, Y> {
	private X codigo01;
	private Y codigo02;

	public Codigo(X codigo01, Y codigo02) {
		super();
		this.codigo01 = codigo01;
		this.codigo02 = codigo02;
	}

	public Codigo<X, Y> getCodigo() {
		return new Codigo<X, Y>(this.codigo01, this.codigo02);
	}

	public void setCodigo(X c01, Y c02) {
		this.codigo01 = c01;
		this.codigo02 = c02;
	}

	public String toString() {
		return this.codigo01 + "" + this.codigo02;
	}

}