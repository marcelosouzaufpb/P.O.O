package Questao02;

public class Questao002 implements Runnable {

	static private int cont = 0;
	private boolean cond = true;

	@Override
	public void run() {

		while (cond) {

		}

	}

	public synchronized void setCont(int cont) {
		Questao002.cont = cont;
	}

	public int getCont() {
		return Questao002.cont;
	}

	public void setCond() {
		cond = false;
	}

}