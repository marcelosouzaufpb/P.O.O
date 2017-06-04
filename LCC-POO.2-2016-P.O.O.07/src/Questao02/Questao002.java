package Questao02;

public class Questao002 implements Runnable {

	static private int contador = 0;
	private boolean cond = true;

	public void run() {
		while (cond) {// Utilizando da condição para continuar execultando a
						// Thread

		}
	}

	public synchronized void setContador(int cont) {// Recebendo o numeor
		Questao002.contador = cont;
	}

	public int getContador() {// Pegando o elemento
		return Questao002.contador;
	}

	public void setCond() {// Condição para a Thread funcionar
		cond = false;
	}

}