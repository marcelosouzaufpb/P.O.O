package Questao08;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CadastraPessoa {
	private List<Pessoa> pessoas;

	public CadastraPessoa(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public CadastraPessoa() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public void cadastraPessoa(Pessoa pess) {
		this.pessoas.add(pess);
		JOptionPane.showMessageDialog(null, "Cadastro feito !!!");
	}

	public String imprimeCadastro() {
		String cadastro = "";
		for (Pessoa p : this.pessoas) {
			cadastro += p.toString() + "\n";
		}
		return cadastro;
	}

}
