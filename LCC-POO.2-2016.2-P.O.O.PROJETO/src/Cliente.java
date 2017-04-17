import java.util.List;

public class Cliente extends Pessoa {

	private List<TreinosDaSemana> trinosDaSemana;
	private Acesso acesso;

	public Cliente(String nome, Idade idade, int rg, int cpf, List<Contato> listaDeContatos,
			List<TreinosDaSemana> trinosDaSemana, Acesso acesso) {
		super(nome, idade, rg, cpf, listaDeContatos);
		this.trinosDaSemana = trinosDaSemana;
		this.acesso = acesso;
	}

	public List<TreinosDaSemana> getTrinosDaSemana() {
		return trinosDaSemana;
	}

	public void setTrinosDaSemana(List<TreinosDaSemana> trinosDaSemana) {
		this.trinosDaSemana = trinosDaSemana;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

}
