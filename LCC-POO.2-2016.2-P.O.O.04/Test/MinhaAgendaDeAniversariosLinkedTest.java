import static org.junit.Assert.assertEquals;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MinhaAgendaDeAniversariosLinkedTest {
	MinhaAgendaDeAniversarios m;

	@Before
	public void setUp() throws Exception {
		m = new MinhaAgendaDeAniversarios();
		m.adicionarAniversariante("Marcelo", 02, 10, 1996);
	}

	@Test
	public void testAdicionarAniversariante() {
		assertEquals(1, m.getAniversariantes().size());
	}

	@Test
	public void testObterAniversariantesDoMes() {
		List<String> l = m.obterAniversarianteDoMes(10);
		assertEquals(1, l.size());
	}

	@Test
	public void testRemoverAniversariante() {
		m.removerAniversariante("Marcelo");
		assertEquals(0, m.getAniversariantes().size());
	}

}
