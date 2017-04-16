import java.util.ArrayList;
import java.util.List;

public class Treinador extends Funcionario {
	private List<Cliente> listaDeCliente;

	public Treinador(String nome, Idade idade, int rg, int cpf, Endereco endereco, Contato telefone) {
		super(nome, idade, rg, cpf, endereco, telefone);
	}

	public Treinador() {
		this.listaDeCliente = new ArrayList<Cliente>();
	}

	public List<Cliente> getListaDeCliente() {
		return listaDeCliente;
	}

	public void setListaDeCliente(List<Cliente> listaDeCliente) {
		this.listaDeCliente = listaDeCliente;
	}

}
