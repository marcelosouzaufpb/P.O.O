package PraticaQuestao01;

import java.util.ArrayList;
import java.util.List;

public class AgendaEletronica implements Lista {
	List<Contato> contatos;

	public AgendaEletronica() {
		this.contatos = new ArrayList<Contato>();
	}

	public AgendaEletronica(ArrayList<Contato> contatos) {
		this.contatos = new ArrayList<Contato>();

	}

	public void addContato(Contato c) {
		this.contatos.add(c);

	}

	public boolean removerContato(Contato c) {
		for (Contato a : this.contatos) {
			if (a.equals(c)) {
				return true;
			}
		}
		return false;
	}

	public void removerContato(String id) {
		for (Contato a : this.contatos) {
			if (a.getNome().contains(id)) {
				this.contatos.remove(a);
				break;
			}
		}
	}

	public List<Contato> listarContatos(String id) {
		List<Contato> contatosEd = new ArrayList<Contato>();
		for (Contato a : this.contatos) {
			if (a.getNome().contains(id)) {
				contatosEd.add(a);
			}
		}
		return contatosEd;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
