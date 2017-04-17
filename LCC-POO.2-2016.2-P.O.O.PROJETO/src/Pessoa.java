import java.util.List;

public class Pessoa {
	private String nome;
	private Idade idade;
	private int rg;
	private int cpf;
	private List<Contato> listaDeContatos;

	public Pessoa(String nome, Idade idade, int rg, int cpf, List<Contato> listaDeContatos) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.listaDeContatos = listaDeContatos;
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

	public List<Contato> getListaDeContatos() {
		return listaDeContatos;
	}

	public void setListaDeContatos(List<Contato> listaDeContatos) {
		this.listaDeContatos = listaDeContatos;
	}

}
