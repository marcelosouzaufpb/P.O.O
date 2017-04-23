package sistemaDeBanco;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GerenciadorDeSenhas implements Comparable<Senha> {
	private int senhaAtual;
	private Queue<Senha> senha;
	private boolean prioridade;

	public int compareTo(Senha s) {
		if (prioridade) {
			if (s.getIdade() == senha.peek().getIdade()) {
				return 0;
			} else if (s.getIdade() < senha.peek().getIdade()) {
				return -1;
			} else {
				return 1;
			}
		}
		return 0;
	}

	public GerenciadorDeSenhas(boolean tipoDePrioridade) {
		if (tipoDePrioridade) {
			senha = new PriorityQueue<Senha>();
		} else {
			senha = new LinkedList<Senha>();
		}
	}

	public void emitirSenha(String nome, int idade, int cpf) {
		Senha s = new Senha(nome, idade, cpf);
		senha.add(s);
		System.out.println(senha.peek());
	}

	public void proximaSenha() {
		senha.remove();
		System.out.println(senha.peek());
	}

	public boolean getPrioridade() {
		return prioridade;
	}

	public int getSenhaAtual() {
		return senhaAtual;
	}

	public void setSenhaAtual(int senhaAtual) {
		this.senhaAtual = senhaAtual;
	}

}
