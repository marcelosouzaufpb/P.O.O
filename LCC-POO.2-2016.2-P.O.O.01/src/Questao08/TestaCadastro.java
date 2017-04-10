package Questao08;

import javax.swing.JOptionPane;

public class TestaCadastro {

	public static void main(String[] args) throws ErroDaEscolhaException {
		CadastraPessoa cp = new CadastraPessoa();
		boolean fimProgrma = false;
		while (!fimProgrma) {
			int menu = Integer.parseInt(JOptionPane.showInputDialog(
					"[1]Cadastra cliente.\n[2]Cadastra funionario.\n[3]Imprime Cadastro.\n[4]Sair.\n\n"));
			if (menu == 1) {
				String nome = JOptionPane.showInputDialog("Digite o nome ?");
				int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo ?"));
				int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia ?"));
				int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes ?"));
				int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano ?"));
				Data d = new Data(dia, mes, ano);
				Pessoa p = new Cliente(nome, d, codigo);
				cp.cadastraPessoa(p);
				fimProgrma = false;
			} else if (menu == 2) {
				String nome = JOptionPane.showInputDialog("Digite o nome ?");
				double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario ? "));
				int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia ?"));
				int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes ?"));
				int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano ?"));
				Data d = new Data(dia, mes, ano);
				Pessoa f = new Funcionario(nome, d, salario);
				cp.cadastraPessoa(f);
				fimProgrma = false;

			} else if (menu == 3) {
				JOptionPane.showMessageDialog(null, cp.imprimeCadastro().toString());
				fimProgrma = false;
			} else if (menu == 4) {
				JOptionPane.showMessageDialog(null, "Fim do programa !!!");
				fimProgrma = true;

			} else {
				throw new ErroDaEscolhaException("Erro na escolha !!!");

			}
		}

	}

}
