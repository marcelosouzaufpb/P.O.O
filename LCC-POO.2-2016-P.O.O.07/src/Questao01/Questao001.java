package Questao01;

public class Questao001 implements Runnable {
	private int inicio;
	private int f;
	
	public Questao001(int inicio, int f){
		this.inicio = inicio;
		this.f = f;
	}
	public void run(){
		for(int k=inicio;k<=f;k++){
			if(primo(k)==true){
				System.out.println(k);
			}
		}
		
	}
	
	public static boolean primo(int n){
		for(int i = 1;i<=n;i++){
			if(n%i == 0){
				if(i != n && i != 1){
					return false;
				}
			}
		}
		return true;
		
	}

}
