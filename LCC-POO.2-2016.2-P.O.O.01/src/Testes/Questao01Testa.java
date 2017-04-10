package Testes;

import org.junit.Before;
import org.junit.Test;

import Questao01.Retangulo;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Questao01Testa {
	Retangulo r;

	@Before
	public void setUp() throws Exception {
		r = new Retangulo(2, 2);
	}

	@Test
	public void testEqualsDoubleDouble() {
		Assert.assertEquals(false, r.equals(1, 1));
	}

	@Test
	public void testPerimetro() {
		Assert.assertEquals(8, r.perimetro());
	}

	@Test
	public void testArea() {
		Assert.assertEquals(4, r.area());
	}

}
