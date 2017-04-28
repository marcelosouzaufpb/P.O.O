package Projeto;

import java.io.IOException;
import java.util.List;

public class Treinador extends Funcionario {

	private Controle controle;
	private List<Cliente> listaDeClientes;

	public Treinador(String nome, Idade idade, int rg, int cpf, Controle controle, List<Cliente> listaDeClientes) {
		super(nome, idade, rg, cpf);
		this.controle = controle;
		this.listaDeClientes = controle.getClientes();
	}

	public double calculaSalario(double salario, List<CargaHoraria> horarioDeTrabalho) {
		List<CargaHoraria> cargH = super.getHorarioDeTrabalho();
		double horas = 0.0;
		for (CargaHoraria a : cargH) {
			horas += a.horasTrabalhadasNoDia();
		}
		return horas * super.getSalario();
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public List<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(List<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public void cadastraClientes(Cliente c) throws IOException {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				throw new IOException("Cliente ja cadastrado !!!");
			}
		}
		this.listaDeClientes.add(c);
	}

	public boolean removeClientes(Cliente c) {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				this.listaDeClientes.remove(a);
				return true;
			}
		}
		return false;
	}

	public void addTreinoDoCliente(Cliente c, Treino t) throws IOException {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				a.addTreino(t);
			}
		}

	}

	public boolean removerTreinoDoCliente(Cliente c, String dia) {
		for (Cliente a : this.listaDeClientes) {
			if (a.equals(c)) {
				a.removerTreino(dia);
				return true;
			}
		}
		return false;
	}
}
