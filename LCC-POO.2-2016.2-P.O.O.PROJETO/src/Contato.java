
public class Contato {
	private Endereco endereco;
	private Telefone telefone;

	public Contato(Endereco endereco, Telefone telefone) {
		super();
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
