package Pratica;

public class QuestaoPraticaPrograma03 implements Runnable {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Thread: " + this.id + " Numero: " + i);
		}
	}

}
