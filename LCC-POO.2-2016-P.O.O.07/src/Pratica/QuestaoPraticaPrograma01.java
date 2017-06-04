package Pratica;

public class QuestaoPraticaPrograma01 extends Thread {
	private int Inicio;
	private int Final;

	public QuestaoPraticaPrograma01(int Inicio, int Final) {
		this.Inicio = Inicio;
		this.Final = Final;
	}

	public void run() {
		for (int i = this.Inicio; i <= this.Final; i++) {
			if (ePrimo(i) == true) {
				System.out.println(i);
			}
		}
	}

	public boolean ePrimo(int numero) {
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				if (i != numero && i != 1) {
					return false;
				}
			}
		}
		return true;
	}

}
