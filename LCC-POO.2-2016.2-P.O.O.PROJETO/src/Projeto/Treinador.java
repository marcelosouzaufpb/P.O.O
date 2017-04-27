package Projeto;

import java.util.List;

public class Treinador extends Funcionario {

	private Controle controle;
	private List<Cliente> listaDeClientes;

	public Treinador(String nome, Idade idade, int rg, int cpf, Controle controle, List<Cliente> listaDeClientes) {
		super(nome, idade, rg, cpf);
		this.controle = controle;
		this.listaDeClientes = controle.getClientes();
	}

	@Override
	public double calculaSalario(double salario, List<CargaHoraria> horarioDeTrabalho) {
		// TODO Auto-generated method stub
		return 0;
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

	public void cadastraClientes(Cliente c) {
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
}
