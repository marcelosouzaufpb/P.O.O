package PraticaQuestao01;

import java.util.List;

public interface Lista {

	public void addContato(Contato c);

	public boolean removerContato(Contato c);

	public void removerContato(String id);
	
	public List<Contato> listarContatos(String id);

}
