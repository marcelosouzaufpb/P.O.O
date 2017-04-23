import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AgendaEletronicaComTreeSet.AgendaEletronicaComTreeSet;
import AgendaEletronicaComTreeSet.Contato;



public class PraticaQuestao02Test {
	Contato c1;
	Contato c2;
	Contato c3;
	AgendaEletronicaComTreeSet agenda;

	@Before
	public void setUp(){
		c1 = new Contato("Nome01", 01, "@01");
		c2 = new Contato("Nome02", 02, "@02");
		agenda = new AgendaEletronicaComTreeSet();
		agenda.addContato(c1);
		agenda.addContato(c2);
	}

	@Test
	public void testAddContato() {
		c3 = new Contato("Nome03",03,"@03");
		agenda.addContato(c3);
		assertEquals(3,agenda.getContatos().size());
	}

	@Test
	public void testRemoverContatoContato() {
		assertTrue(agenda.removerContato(c2));
	}

	@Test
	public void testRemoverContatoString() {
		agenda.removerContato("02");
		assertEquals(1,agenda.getContatos().size());
	}

	@Test
	public void testListarContatos() {
		assertEquals(1,agenda.listarContatos("02").size());
	}

}
