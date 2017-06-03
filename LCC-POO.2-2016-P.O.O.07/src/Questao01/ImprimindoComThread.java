package Questao01;

public class ImprimindoComThread {

	public static void main(String[] args) {
		int i;
		
		for (int n = 1; n <= 99999; n++) {
			
			boolean ehPrimo = true;
			
			i = 2;
			
			while ((ehPrimo == true) && (i <= (n / 2))) {
				
				if ((n % i) == 0) ehPrimo = false;
				
				else i++;
			}
			if (ehPrimo == true){
				long startTime = System.currentTimeMillis();
				System.out.println(n + "," + startTime + "\n");
			}
				
		}
		System.out.println();
	}
}
