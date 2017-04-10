import java.util.Iterator;
import java.util.LinkedList;

public class MinhaAgendaDeAniversariosLinked {

	private LinkedList<Aniversariante> lista;

	public LinkedList<Aniversariante> getLista() {
		return lista;
	}

	public MinhaAgendaDeAniversariosLinked(LinkedList<Aniversariante> an) {
		lista = an;
	}

	public void adicionarAniversariante(String nome, int dia, int mes, int ano) {
		Aniversariante a01 = new Aniversariante(nome, dia, mes, ano);
		lista.add(a01);
	}

	public LinkedList<String> obterAniversariantesDoMes(int mes) {
		LinkedList<String> lista = new LinkedList<String>();
		for (Aniversariante aniversario : this.lista) {
			if (aniversario.ehAniversarianteDoMes(mes))
				lista.add(aniversario.getNome());
		}
		return lista;
	}

	public void removerAniversariante(String nomeAniversariante) {
		Iterator<Aniversariante> ai = lista.iterator();
		while (ai.hasNext()) {
			String a = ai.next().getNome();
			if (a.equals(nomeAniversariante))
				ai.remove();
		}
	}

}
