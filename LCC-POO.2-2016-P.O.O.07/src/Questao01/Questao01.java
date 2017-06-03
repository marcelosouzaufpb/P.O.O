package Questao01;

public class Questao01 {
	public static void main(String[] args) {
		Questao001 q1 = new Questao001(1, 10);
		Thread t1 = new Thread(q1);
		
		Questao001 q2 = new Questao001(11, 20);
		Thread t2 = new Thread(q2);
		Questao001 q3 = new Questao001(21, 30);
		Thread t3 = new Thread(q3);

		t1.start();
		t2.start();
		t3.start();
	}

}
