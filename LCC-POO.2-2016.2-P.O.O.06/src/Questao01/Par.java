package Questao01;

public class Par<X, Y> {
	private X x;
	private Y y;

	public Par(X x, Y y) {
		this.x = x;
		this.setY(y);
	}

	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public Y getY() {
		return y;
	}

	public void setY(Y y) {
		this.y = y;
	}

	public String toString() {
		return this.x + "\n" + this.y;
	}

}
