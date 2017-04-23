import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import AgendaEletronicaComHashMap.AgendaEletronicaComHashMap;
import AgendaEletronicaComHashMap.Contato;

public class PraticaQuestao03Test {
	Contato c1;
	Contato c2;
	Contato c3;
	AgendaEletronicaComHashMap agenda;

	@Before
	public void setUp() throws Exception {
		c1 = new Contato(01, "@01");
		c2 = new Contato(02, "@02");
		agenda = new AgendaEletronicaComHashMap();
		agenda.addContato("Nome01", c1);
		agenda.addContato("Nome02", c2);
	}

	@Test
	public void testAddContato() {
		c3 = new Contato(03, "@03");
		agenda.addContato("Nome03", c3);
		assertEquals(3, agenda.getContatos().size());
	}

	@Test
	public void testRemoverContatoContato() {
		assertTrue(agenda.removerContato(c2));
	}

	@Test
	public void testRemoverContatoString() {
		agenda.removerContato("02");
		assertEquals(1, agenda.getContatos().size());
	}

	@Test
	public void testListarContatos() {
		assertEquals(1, agenda.listarContatos("02").size());
	}

}
