package AgendaEletronicaComTreeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class AgendaEletronicaComTreeSet {

	private TreeSet<Contatos> treeSetDeContatos;

	public TreeSet<Contatos> getContatos() {
		return this.treeSetDeContatos;
	}

	public AgendaEletronicaComTreeSet() {
		this.treeSetDeContatos = new TreeSet<Contatos>();
	}

	public void addContato(Contatos c1) {
		this.treeSetDeContatos.add(c1);
	}

	public boolean removerContato(Contatos c) {
		for (Contatos contatos : this.treeSetDeContatos) {
			if (contatos.compareTo(c) == 0) {
				this.treeSetDeContatos.remove(c);
				return true;
			}
		}
		return false;
	}

	public void removerContato(String id) {
		Iterator<Contatos> i = this.treeSetDeContatos.iterator();
		while (i.hasNext()) {
			Contatos a = i.next();
			if (a.getNome().toUpperCase().contains(id.toUpperCase())) {
				i.remove();
			}
		}
	}

	public List<Contatos> listarContatos(String id) {
		Iterator<Contatos> i = treeSetDeContatos.iterator();
		List<Contatos> contatosListados = new ArrayList<Contatos>();
		while (i.hasNext()) {
			Contatos a = i.next();
			if (a.getNome().contains(id)) {
				contatosListados.add(a);
			}
		}
		return contatosListados;
	}

}