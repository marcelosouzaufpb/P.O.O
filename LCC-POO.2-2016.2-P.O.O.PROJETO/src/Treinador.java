import java.util.List;

public class Treinador extends Funcionario {
	private List<Cliente> listaDeCliente;

	public Treinador(String nome, Idade idade, int rg, int cpf, List<Contato> listaDeContatos,
			List<Cliente> listaDeCliente) {
		super(nome, idade, rg, cpf, listaDeContatos);
		this.listaDeCliente = listaDeCliente;
	}

	public List<Cliente> getListaDeCliente() {
		return listaDeCliente;
	}

	public void setListaDeCliente(List<Cliente> listaDeCliente) {
		this.listaDeCliente = listaDeCliente;
	}

}
