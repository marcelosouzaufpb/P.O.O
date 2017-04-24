import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import sistemaDeBanco.GerenciadorDeSenhas;
import sistemaDeBanco.Senha;

public class PraticaQuestao04Test {
	GerenciadorDeSenhas g1;

	@Before
	public void setUp() throws Exception {
		g1 = new GerenciadorDeSenhas(true);
		g1.emitirSenha("m03", 40, 423);
		g1.emitirSenha("m04", 30, 331);

	}

	@Test
	public void testEmitirSenha() {
		g1.emitirSenha("m01", 10, 123);
		g1.emitirSenha("m02", 20, 321);
		assertEquals(g1.getSenhas().size(), 4);

	}

	@Test
	public void testProximaSenha() {
		Senha s = new Senha("m03", 40, 423);
		assertEquals(g1.proximaSenha().toString(), s.toString());

	}
}
