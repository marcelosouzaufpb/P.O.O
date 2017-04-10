import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarianteDoMes {
	private ArrayList<Aniversariante> aniversariantes;

	public MinhaAgendaDeAniversarios() {
		this.aniversariantes = (ArrayList<Aniversariante>) new ArrayList<Aniversariante>();
	}

	public MinhaAgendaDeAniversarios(List<Aniversariante> aniversariantes) {
		this.aniversariantes = new ArrayList<Aniversariante>();
	}

	public void adicionarAniversariante(String nome, int dia, int mes, int ano) {
		Aniversariante a1 = new Aniversariante(nome, dia, mes, ano);
		aniversariantes.add(a1);

	}

	public ArrayList<String> obterAniversarianteDoMes(int mes) {
		ArrayList<String> nomes = new ArrayList<String>();
		for (Aniversariante q : this.aniversariantes) {
			if (q.getDataAniversario().getMes() == mes) {
				nomes.add(q.getNome());
			}
		}
		return nomes;

	}

	public void removerAniversariante(String nomeAniversariante) {
		Iterator<Aniversariante> i = aniversariantes.iterator();
		while (i.hasNext()) {
			Aniversariante a = i.next();
			if (a.getNome().equals(nomeAniversariante)) {
				i.remove();
			}
		}

	}

	public List<Aniversariante> getAniversariantes() {
		return aniversariantes;
	}

	public void setAniversariantes(List<Aniversariante> aniversariantes) {
		this.aniversariantes = (ArrayList<Aniversariante>) aniversariantes;
	}

}
