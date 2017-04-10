package Testes;

import Questao04.Bits;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class Questao04Testa {
	Bits bits;

	@Before
	public void setUp() throws Exception {
		bits = new Bits(2);
		boolean[] bitsLista = new boolean[] { false, true };
		bits.setBits(bitsLista);
	}

	@Test
	public void testAnd() throws Exception {
		boolean[] bits2 = new boolean[] { true, true };
		boolean[] bits3 = new boolean[] { false, true };
		boolean[] b = new boolean[] { false, false };
		Bits compara = new Bits(2);
		compara.setBits(b);
		Assert.assertEquals(compara.toString(), bits.and(bits2, bits3).toString());
	}

	@Test
	public void testOr() throws Exception {
		boolean[] bits2 = new boolean[] { false, true };
		boolean[] bits3 = new boolean[] { false, true };
		Bits compara = new Bits(2);
		boolean[] b = new boolean[] { true, true };
		compara.setBits(b);
		Assert.assertEquals(compara.toString(), bits.or(bits2, bits3).toString());
	}

	@Test
	public void testNot() {
		boolean[] bits2 = new boolean[] { false, true };
		boolean[] b = new boolean[] { true, false };
		Bits compara = new Bits(2);
		compara.setBits(b);
		Assert.assertEquals(compara.toString(), bits.not(bits2).toString());
	}

}
