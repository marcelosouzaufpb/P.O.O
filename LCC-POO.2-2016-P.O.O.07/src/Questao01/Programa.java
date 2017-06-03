package Questao01;

public class Programa implements Runnable {
	private int x;

	public Programa() {
		this.x = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		for (int n = 1; n <= 99999; n++) {

			boolean ehPrimo = true;

			x = 2;

			while ((ehPrimo == true) && (x <= (n / 2))) {

				if ((n % x) == 0)
					ehPrimo = false;

				else
					x++;
			}
			if (ehPrimo == true)
				System.out.printf(n + "\n");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setX(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
	}

}
