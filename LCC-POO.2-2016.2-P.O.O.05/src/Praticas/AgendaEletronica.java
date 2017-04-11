package Praticas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronica {
	private List<Contato> listaDeContatos;

	public List<Contato> getListaDeContatos() {
		return listaDeContatos;
	}

	public AgendaEletronica() {
		this.listaDeContatos = new ArrayList<Contato>();
	}

	public void addContato(Contato c) {
		this.listaDeContatos.add(c);
	}

	public boolean removerContato(Contato c) {
		for (Contato contatos : this.listaDeContatos) {
			if (contatos.equals(c)) {
				this.listaDeContatos.remove(c);
				return true;
			}
		}
		return false;
	}

	public void removerContato(String id) {
		Iterator<Contato> i = this.listaDeContatos.iterator();
		while (i.hasNext()) {
			Contato a = i.next();
			if (a.getNome().toLowerCase().contains(id.toLowerCase())) {
				i.remove();
			}
		}
	}

	public List<Contato> listarContatos(String id) {
		Iterator<Contato> i = listaDeContatos.iterator();
		List<Contato> contatosListados = new ArrayList<Contato>();
		while (i.hasNext()) {
			Contato a = i.next();
			if (a.getNome().toLowerCase().contains(id.toLowerCase())) {
				contatosListados.add(a);
			}
		}
		return contatosListados;
	}

}