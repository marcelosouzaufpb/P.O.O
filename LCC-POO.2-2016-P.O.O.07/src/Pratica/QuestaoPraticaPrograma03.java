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
			try{
				Thread.sleep(10000);
			}catch (Exception e) {
				e.getMessage();
			}
			System.out.println("Thread: " + this.id + " Numero: " + i);
		}
	}

}
