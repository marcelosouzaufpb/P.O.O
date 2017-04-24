package sistemaDeBanco;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GerenciadorDeSenhas {
	private int senhaAtual;
	private Queue<Senha> senha;
	private boolean prioridade;

	public void emitirSenha(String nome, int idade, int cpf) {
		Senha s = new Senha(nome, idade, cpf);
		senha.offer(s);
	}

	public GerenciadorDeSenhas(boolean tipoDePrioridade) {
		if (tipoDePrioridade) {
			senha = new PriorityQueue<Senha>();
		} else {
			senha = new LinkedList<Senha>();
		}
	}

	public Senha proximaSenha() {
		return senha.poll();
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

	public Queue<Senha> getSenhas() {
		return this.senha;
	}

}
