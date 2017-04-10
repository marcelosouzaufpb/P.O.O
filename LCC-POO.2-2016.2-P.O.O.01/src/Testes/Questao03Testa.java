package Testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Questao03.Poligono;
import Questao03.Ponto;
import Questao03.ElementoJaExisteException;

public class Questao03Testa {
	Poligono pg;

	@Before
	public void setUp() throws Exception {
		pg = new Poligono();

	}

	@Test(expected = ElementoJaExisteException.class)
	public void testAdd() throws Exception {
		Ponto ponto1 = new Ponto();
		ponto1.setX(2);
		ponto1.setY(2);
		pg.add(ponto1);
		Ponto ponto2 = new Ponto();
		ponto2.setX(2);
		ponto2.setY(2);
		for (Ponto p : pg.getPoli()) {
			if (ponto2.equals(p)) {
				throw new ElementoJaExisteException("");
			} else {
				pg.add(ponto2);
			}
		}

	}

	@Test
	public void testRemove() throws Exception {
		Ponto ponto3 = new Ponto();
		ponto3.setX(2);
		ponto3.setY(3);
		pg.add(ponto3);
		Assert.assertTrue(pg.remove(ponto3));

	}

	@Test
	public void testAre() throws Exception {
		Ponto ponto4 = new Ponto();
		ponto4.setX(1.0);
		ponto4.setY(2.0);
		pg.add(ponto4);
		Ponto ponto5 = new Ponto();
		ponto5.setX(2.0);
		ponto5.setY(1.0);
		pg.add(ponto5);
		Assert.assertEquals(-1.0, pg.are(), 0.01);
	}

}
