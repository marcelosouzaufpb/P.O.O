package Questao02;

public class Questao02 {
	public static void main(String[] args) {

		Questao002 q = new Questao002();

		int[][] a = new int[10][10];

		for (int i = 0; i < a.length; i++) {

			for (int x = 0; x < a[i].length; x++) {
				a[i][x] = 1;
			}
		}

		for (int i = 0; i < a.length; i++) {
			Thread t1 = new Thread(q);
			t1.start();
			for (int x = 0; x < a[i].length; x++) {
				System.out.println("Thread " + i + " executando linha: " + x);
				q.setCont(q.getCont() + a[i][x]);
			}
			q.setCond();
		}

		System.out.print(q.getCont());

	}

}