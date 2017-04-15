
public class Pessoa {
	private String nome;
	private Idade idade;
	private int rg;
	private int cpf;
	private Endereco endereco;
	private Contato telefone;

	public Pessoa(String nome, Idade idade, int rg, int cpf, Endereco endereco, Contato telefone) {
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Pessoa() {
		this.nome = "";
		this.idade = null;
		this.rg = 0;
		this.cpf = 0;
		this.endereco = null;
		this.telefone = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Idade getIdade() {
		return idade;
	}

	public void setIdade(Idade idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getTelefone() {
		return telefone;
	}

	public void setTelefone(Contato telefone) {
		this.telefone = telefone;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + rg;
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf != other.cpf)
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg != other.rg)
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

}
