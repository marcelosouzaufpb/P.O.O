import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Questao05.Dicionario;

public class Questao05Test {
	Dicionario<Integer, String> d1;

	@Before
	public void setUp() throws Exception {
		d1 = new Dicionario<Integer, String>();
		d1.add(0, "m01");
		d1.add(1, "m02");
	}

	@Test
	public void testAdd() {
		assertEquals(d1.getTamanho(), 2);
	}

	@Test
	public void testGetValue() {
		assertEquals("m01", d1.getValue(0));
	}

}