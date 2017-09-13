package Questao02;

public class Questao02 {
	public static void main(String[] args) {

		Questao002 q = new Questao002();

		int[][] a = new int[10][10];// Criando o array

		for (int i = 0; i < a.length; i++) {
			for (int x = 0; x < a[i].length; x++) {// Que todos os elementos do
													// array recebam 1.
				a[i][x] = 1;
			}
		}

		for (int i = 0; i < a.length; i++) {
			Thread t1 = new Thread(q);
			t1.start();
			for (int x = 0; x < a[i].length; x++) {// Soma dos elementos
				System.out.println("Thread " + i + " executando linha: " + x);
				q.setContador(q.getContador() + a[i][x]);
			}
			q.setCond();// Parando a Thread
		}

		System.out.print(q.getContador());

	}

}