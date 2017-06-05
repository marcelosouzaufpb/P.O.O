package Pratica;

public class QuestaoPraticaMAIN03 {

	public static void main(String[] args) throws InterruptedException {
		QuestaoPraticaPrograma03 q1 = new QuestaoPraticaPrograma03();
		q1.setId(1);

		Thread t1 = new Thread(q1);
		t1.start();
		
		

		QuestaoPraticaPrograma03 q2 = new QuestaoPraticaPrograma03();
		q2.setId(2);

		Thread t2 = new Thread(q2);
		t2.start();

	}

}
