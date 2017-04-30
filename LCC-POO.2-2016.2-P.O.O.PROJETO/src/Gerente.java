import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
	private List<Treinador> treinadores;
	private List<Acesso> acessoDosTreinadores;
	private Controle controle;

	public Gerente(String nome, Data dataDeNascimento, int cpf, int rg, Contato contatos, List<Treinador> treinadores,
			List<Acesso> acessoDosTreinadores, Controle controle) {
		super(nome, dataDeNascimento, cpf, rg, contatos);
		this.treinadores = new ArrayList<Treinador>();
		this.acessoDosTreinadores = new ArrayList<Acesso>();
		this.setControle(controle);

	}

	public double calculaSalario() {
		double horasTrabalhadas = 0.0;
		for (String s : super.getHorasEDiaTrabalho().getDiasDaSemana()) {
			String[] numero = s.split(",");
			horasTrabalhadas += Double.parseDouble(numero[1]);
		}
		return horasTrabalhadas * super.getSalario();
	}

	public void cadastrarTreinador(Treinador t) throws IOException {
		for (Treinador a : this.treinadores) {
			if (a.equals(t) && a.getAcesso().equals(t.getAcesso())) {
				throw new IOException("Treinador ja cadastrado !!!");
			}
		}
		this.treinadores.add(t);
		this.acessoDosTreinadores.add(t.getAcesso());
	}

	public void removerTreinador(Treinador t) throws IOException {
		for (Treinador a : this.treinadores) {
			if (a.equals(t) && a.getAcesso().equals(t.getAcesso())) {
				this.acessoDosTreinadores.remove(a.getAcesso());
				this.treinadores.remove(a.getAcesso());
			}
		}
		throw new IOException("Treinador nao encontrado !!!");
	}

	public void alterarSalarioDoTreinador(Treinador t, double salario) throws IOException {
		for (Treinador a : this.treinadores) {
			if (a.equals(t) && a.getAcesso().equals(t.getAcesso())) {
				a.setSalario(salario);
			}
		}
		throw new IOException("Treinador nao encontrado !!!");
	}

	public String listaDosHorariosDoTreinador(Treinador t) throws IOException {
		for (Treinador a : this.treinadores) {
			if (a.equals(t) && a.getAcesso().equals(t.getAcesso())) {
				return a.listaDosHorariosDoTreinador();

			}
		}
		throw new IOException("Treinador nao encontrado !!!");
	}

	public void alterarLogESenhaDoTreinador(Treinador t) throws IOException {
		for (Treinador a : this.treinadores) {
			{
				if (a.equals(t)) {
					String login = JOptionPane.showInputDialog("Digite o novo login ?");
					String senha = JOptionPane.showInputDialog("Digite a nova senha ?");
					a.getAcesso().setLogin(login);
					a.getAcesso().setSenha(senha);
				}
			}

		}
		throw new IOException("Treinador nao encontrado !!!");

	}

	public void alterarTurnoDoTreinador(Treinador t) throws IOException {
		for (Treinador a : this.treinadores) {
			if (a.equals(t)) {
				String turno = JOptionPane.showInputDialog("Digite o novo turno ? ");
				a.setTurno(turno);
			}
		}

		throw new IOException("Treinador nao encontrado !!!");
	}

	public void alterarTurnoDoCliente(Cliente c) throws IOException {
		this.controle.getTreinadores().alterarLogESenhaDoCliente(c);
	}

	public void alterarLogESenhaDoCliente(Cliente c) throws IOException {
		this.controle.getTreinadores().alterarLogESenhaDoCliente(c);

	}

	public void cadastraCliente(Cliente c) throws IOException {
		this.controle.getTreinadores().cadastrarCliente(c);

	}

	public void removerCliente(Cliente c) throws IOException {
		this.controle.getTreinadores().removerCliente(c);
	}

	public List<Treinador> getTreinadores() {
		return treinadores;
	}

	public void setTreinadores(List<Treinador> treinadores) {
		this.treinadores = treinadores;
	}

	public List<Acesso> getAcessoDosTreinadores() {
		return acessoDosTreinadores;
	}

	public void setAcessoDosTreinadores(List<Acesso> acessoDosTreinadores) {
		this.acessoDosTreinadores = acessoDosTreinadores;
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((acessoDosTreinadores == null) ? 0 : acessoDosTreinadores.hashCode());
		result = prime * result + ((treinadores == null) ? 0 : treinadores.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		if (acessoDosTreinadores == null) {
			if (other.acessoDosTreinadores != null)
				return false;
		} else if (!acessoDosTreinadores.equals(other.acessoDosTreinadores))
			return false;
		if (treinadores == null) {
			if (other.treinadores != null)
				return false;
		} else if (!treinadores.equals(other.treinadores))
			return false;
		return true;
	}

}
