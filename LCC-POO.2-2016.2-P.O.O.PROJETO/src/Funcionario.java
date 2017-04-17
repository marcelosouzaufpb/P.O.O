import java.util.List;

public class Funcionario extends Pessoa {

	private double salario;
	private Acesso acesso;
	public List<HorarioDeTrabalho> cargaHoraria;

	public Funcionario(String nome, Idade idade, int rg, int cpf, List<Contato> listaDeContatos) {
		super(nome, idade, rg, cpf, listaDeContatos);
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
