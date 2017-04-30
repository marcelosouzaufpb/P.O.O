import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Treinador extends Funcionario {
	private Acesso acesso;
	private List<Cliente> clientes;
	private List<Acesso> acessoDosClientes;
	private String turno;

	public Treinador(double salario, HorarioEDiaDeTrabalho horasEDiaTrabalho, String funcao, String acesso,
			List<Cliente> clientes, List<Acesso> acessoDosClientes, String turno) {
		super(salario, horasEDiaTrabalho, funcao);
		this.clientes = new ArrayList<Cliente>();
		this.acessoDosClientes = new ArrayList<Acesso>();
		this.turno = turno;
	}

	public double calculaSalario() {
		double horasTrabalhadas = 0.0;
		for (String s : super.getHorasEDiaTrabalho().getDiasDaSemana()) {
			String[] numero = s.split(",");
			horasTrabalhadas += Double.parseDouble(numero[1]);
		}
		return horasTrabalhadas * 0.5;

	}

	public String listaDosHorariosDoTreinador() {
		return super.getHorasEDiaTrabalho().getHorasDia().toString();
	}

	public void cadastrarCliente(Cliente c) throws IOException {
		for (Cliente a : this.clientes) {
			if (a.equals(c)) {
				throw new IOException("Cliente ja cadastrado !!!");
			}
		}
		this.acessoDosClientes.add(c.getAcesso());
		this.clientes.add(c);
	}

	public void removerCliente(Cliente c) throws IOException {
		for (Cliente a : this.clientes) {
			if (a.equals(c)) {
				this.acessoDosClientes.remove(a.getAcesso());
				this.clientes.remove(a);
			}
		}
		throw new IOException("Cliente nao cadastrado !!!");
	}

	public double imcDoCliente(Cliente c) throws IOException {
		for (Cliente a : this.clientes) {
			if (a.equals(c)) {
				return a.imc();
			}
		}
		throw new IOException("Cliente nao encontrado !!!");

	}

	public String treinoDoCliente(Cliente c) throws IOException {
		for (Cliente a : this.clientes) {
			if (a.equals(c)) {
				return a.treinoDaSemana();
			}
		}
		throw new IOException("Cliente nao encontrado !!!");
	}

	public void alterarTreinoDoCliente(Cliente c) throws IOException {
		for (Cliente a : this.clientes) {
			if (a.equals(c)) {
				String dia = JOptionPane.showInputDialog("Qual dia ?");
				a.alterarTreino(dia);
			}
		}
		throw new IOException("Cliente nao achado ?");

	}

	public void alterarLogESenhaDoCliente(Cliente c) throws IOException {
		for (Cliente a : this.clientes) {
			if (a.equals(c)) {
				String login = JOptionPane.showInputDialog("Digite o novo login ?");
				String senha = JOptionPane.showInputDialog("Digite a nova senha ?");
				a.getAcesso().setLogin(login);
				a.getAcesso().setSenha(senha);
			}
		}
		throw new IOException("Cliente nao encontrado !!!");
	}

	public void alterarTurnoDoCliente(Cliente c) throws IOException {
		for (Cliente a : this.clientes) {
			if (a.equals(c)) {
				String turno = JOptionPane.showInputDialog("Digite o novo turno ? ");
				a.setTurno(turno);
			}
		}
		throw new IOException("Cliente nao encontrado !!!");
	}

	public String toString() {
		return this.acesso.toString();

	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Acesso> getAcessoDosClientes() {
		return acessoDosClientes;
	}

	public void setAcessoDosClientes(List<Acesso> acessoDosClientes) {
		this.acessoDosClientes = acessoDosClientes;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((acesso == null) ? 0 : acesso.hashCode());
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treinador other = (Treinador) obj;
		if (acesso == null) {
			if (other.acesso != null)
				return false;
		} else if (!acesso.equals(other.acesso))
			return false;
		if (clientes == null) {
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
			return false;
		return true;
	}

}
