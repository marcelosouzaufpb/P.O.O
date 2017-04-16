import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
	private double salario;
	private Acesso acesso;
	public List<HorarioDeTrabalho> cargaHoraria;

	public Funcionario(String nome, Idade idade, int rg, int cpf, Endereco endereco, Contato telefone) {
		super(nome, idade, rg, cpf, endereco, telefone);

	}

	public Funcionario() {
		this.acesso = null;
		this.setSalario(0.0);
		this.cargaHoraria = new ArrayList<HorarioDeTrabalho>(5);
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
