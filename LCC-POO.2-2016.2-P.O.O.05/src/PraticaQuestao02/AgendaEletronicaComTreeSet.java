package PraticaQuestao02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AgendaEletronicaComTreeSet {
	Set<Contatos> contatos;

	public AgendaEletronicaComTreeSet() {
		this.contatos = new TreeSet<Contatos>();
	}

	public void addContatos(Contatos c) {
		this.contatos.add(c);
	}

	public boolean removerContatos(Contatos c) {
		Iterator<Contatos> con = this.contatos.iterator();
		while (con.hasNext()) {
			Contatos cont = con.next();
			if (cont.equals(c)) {
				con.remove();
				return true;
			}
		}
		return false;
	}

	public void removerContatos(String id) {
		Iterator<Contatos> con = this.contatos.iterator();
		while (con.hasNext()) {
			Contatos cont = con.next();
			if (cont.getNome().contains(id)) {
				con.remove();
			}
		}
	}

	public Set<Contatos> listaDeContatos(String id) {
		Set<Contatos> lista = new TreeSet<Contatos>();
		for (Contatos c : this.contatos) {
			if (c.getNome().contains(id)) {
				lista.add(c);
			}
		}
		return lista;
	}

	public Set<Contatos> getList() {
		return this.contatos;
	}

}
