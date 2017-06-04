package Pratica;

public class QuestaoPraticaMAIN01 {
	public static void main(String[] args) {
		QuestaoPraticaPrograma01 q1 = new QuestaoPraticaPrograma01(1, 10000);
		Thread t1 = new Thread(q1);

		QuestaoPraticaPrograma01 q2 = new QuestaoPraticaPrograma01(10001, 20000);
		Thread t2 = new Thread(q2);

		QuestaoPraticaPrograma01 q3 = new QuestaoPraticaPrograma01(20001, 30000);
		Thread t3 = new Thread(q3);

		QuestaoPraticaPrograma01 q4 = new QuestaoPraticaPrograma01(30001, 40000);
		Thread t4 = new Thread(q4);

		QuestaoPraticaPrograma01 q5 = new QuestaoPraticaPrograma01(40001, 50000);
		Thread t5 = new Thread(q5);

		QuestaoPraticaPrograma01 q6 = new QuestaoPraticaPrograma01(50001, 60000);
		Thread t6 = new Thread(q6);

		QuestaoPraticaPrograma01 q7 = new QuestaoPraticaPrograma01(60001, 70000);
		Thread t7 = new Thread(q7);

		QuestaoPraticaPrograma01 q8 = new QuestaoPraticaPrograma01(70001, 80000);
		Thread t8 = new Thread(q8);

		QuestaoPraticaPrograma01 q9 = new QuestaoPraticaPrograma01(80001, 90000);
		Thread t9 = new Thread(q9);

		QuestaoPraticaPrograma01 q10 = new QuestaoPraticaPrograma01(90001, 99999);
		Thread t10 = new Thread(q10);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}
