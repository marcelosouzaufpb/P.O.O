package Testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Questao02.Pessoa;

public class Questao02Testa {
	Pessoa p;

	@Before
	public void setUp() throws Exception {
		p = new Pessoa(2.0, 64.0);
	}

	@Test
	public void testIMC() {
		Assert.assertEquals(16.0, p.IMC(), 0.01);
	}

}
