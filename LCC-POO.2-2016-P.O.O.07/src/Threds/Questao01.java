package Threds;

public class Questao01 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			public void run() {
				for (int i = 0; i <= 99999; i++) {
					if (ehPrimo(i)) {
						System.out.println(i);
					}
				}

			}
		};
		Thread t = new Thread(r);
		t.start();

	}

	public static boolean ehPrimo(int numero) {
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			return true;
		} else {
			return false;
		}
	}

}
