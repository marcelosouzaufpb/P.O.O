package Pratica;

public class QuestaoPraticaMAIN02 {
	public static void main(String[] args) {
		int[][] vetor = new int[10][10];
		QuestaoPraticaPrograma02 programa = new QuestaoPraticaPrograma02();

		for (int i = 0; i < vetor.length; i++) {
			for (int k = 0; k < vetor[i].length; k++) {
				vetor[i][k] = 1;
			}
		}

		for (int i = 0; i < vetor.length; i++) {
			Thread t = new Thread(programa);
			t.start();
			for (int k = 0; k < vetor[i].length; k++) {
				System.out.println("Thread " + i + " executando linha: " + k);
				programa.setContador(programa.getContador() + vetor[i][k]);
			}
			programa.setCondicao();
		}
		System.out.print(programa.getContador());
	}

}
