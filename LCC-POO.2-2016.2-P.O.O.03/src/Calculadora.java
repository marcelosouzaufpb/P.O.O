import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		boolean fimDoPrograma = false;
		while (!fimDoPrograma) {
			int menu = Integer.parseInt(JOptionPane
					.showInputDialog("[1]-Maior.\n[2]-Soma.\n[3]-Subtrai.\n[4]-Raiz.\n[5]-Media.\n[6]-Sair.\n\n"));
			if (menu == 1) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para A ?"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para B ?"));
				int maior = Calculadora.maior(a, b);
				JOptionPane.showMessageDialog(null, maior);
				fimDoPrograma = false;
			} else if (menu == 2) {
				int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeor voce quer ? "));
				int[] numero = new int[n];
				for (int k = 0; k < n; k++) {
					int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero ?"));
					numero[k] = num;
					fimDoPrograma = false;
				}
				int soma = Calculadora.soma(numero);
				JOptionPane.showMessageDialog(null, soma);
			} else if (menu == 3) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para A ?"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para B ?"));
				int subtrai = Calculadora.subtrai(a, b);
				JOptionPane.showMessageDialog(null, subtrai);
				fimDoPrograma = false;
			} else if (menu == 4) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para A ?"));
				double raiz = Calculadora.raiz(a);
				JOptionPane.showMessageDialog(null, raiz);
				fimDoPrograma = false;
			} else if (menu == 5) {
				int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeor voce quer ? ?"));
				double[] media = new double[n];
				for (int k = 0; k < n; k++) {
					double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero ?"));
					media[k] = num;
				}
				double med = Calculadora.media(media);
				JOptionPane.showMessageDialog(null, med);
				fimDoPrograma = false;
			} else if (menu == 6) {
				fimDoPrograma = true;
			} else {
				JOptionPane.showMessageDialog(null, "Erro no Menu !!!");
			}
		}
	}

	public static int maior(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return a;
		}
	}

	public static int soma(int... a) {
		int soma = 0;
		for (int k = 0; k < a.length; k++) {
			soma += a[k];
		}
		return soma;
	}

	public static int subtrai(int a, int b) {
		return a - b;
	}

	public static double raiz(double a) {
		return Math.sqrt(a);
	}

	public static double media(double... a) {
		if (a.length == 0) {
			return 0;
		} else {
			double media = 0;
			for (int k = 0; k < a.length; k++) {
				media += a[k];
			}
			return (media / a.length);
		}
	}
}
