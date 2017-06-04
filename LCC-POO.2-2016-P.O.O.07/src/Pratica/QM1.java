package Pratica;

public class QM1 {
	public static void main(String[] args) {
		QP1 q1 = new QP1(1, 10000);
		Thread t1 = new Thread(q1);

		QP1 q2 = new QP1(10001, 20000);
		Thread t2 = new Thread(q2);

		QP1 q3 = new QP1(20001, 30000);
		Thread t3 = new Thread(q3);

		QP1 q4 = new QP1(30001, 40000);
		Thread t4 = new Thread(q4);

		QP1 q5 = new QP1(40001, 50000);
		Thread t5 = new Thread(q5);

		QP1 q6 = new QP1(50001, 60000);
		Thread t6 = new Thread(q6);

		QP1 q7 = new QP1(60001, 70000);
		Thread t7 = new Thread(q7);

		QP1 q8 = new QP1(70001, 80000);
		Thread t8 = new Thread(q8);

		QP1 q9 = new QP1(80001, 90000);
		Thread t9 = new Thread(q9);

		QP1 q10 = new QP1(90001, 99999);
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
