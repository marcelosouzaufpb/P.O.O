import java.util.List;

public class Gerente extends Funcionario {
	private Controle controle;

	public Gerente(String nome, Idade idade, int rg, int cpf, List<Contato> listaDeContatos) {
		super(nome, idade, rg, cpf, listaDeContatos);

	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

}
