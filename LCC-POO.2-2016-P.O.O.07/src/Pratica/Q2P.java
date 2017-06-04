package Pratica;

public class Q2P implements Runnable {
	static private int contador = 0;
	private boolean condicao = false;

	public int getContador() {
		return contador;
	}

	public synchronized void setContador(int contador) {
		Q2P.contador = contador;
	}

	public void setCondicao() {
		this.condicao = true;
	}

	public void run() {
		while (condicao) {

		}
	}

}
