
public class Pessoa {
	private String nome;
	private Data dataDeNascimento;
	private int cpf;
	private int rg;
	private Contato contatos;

	public Pessoa() {
		this.nome = "";
		this.dataDeNascimento = null;
		this.cpf = 0;
		this.rg = 0;
		this.contatos = null;
	}

	public Pessoa(String nome, Data dataDeNascimento, int cpf, int rg, Contato contatos) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.contatos = contatos;
	}

	public String toString() {
		return "NOME: " + this.nome + ".\n" + this.dataDeNascimento.toString() + ".\n" + "CPF: " + this.cpf + ".\n"
				+ "RG: " + this.rg + ".\n" + this.contatos.toString() + ".";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Data dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public Contato getContatos() {
		return contatos;
	}

	public void setContatos(Contato contatos) {
		this.contatos = contatos;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contatos == null) ? 0 : contatos.hashCode());
		result = prime * result + cpf;
		result = prime * result + ((dataDeNascimento == null) ? 0 : dataDeNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + rg;
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
		if (contatos == null) {
			if (other.contatos != null)
				return false;
		} else if (!contatos.equals(other.contatos))
			return false;
		if (cpf != other.cpf)
			return false;
		if (dataDeNascimento == null) {
			if (other.dataDeNascimento != null)
				return false;
		} else if (!dataDeNascimento.equals(other.dataDeNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg != other.rg)
			return false;
		return true;
	}

}
