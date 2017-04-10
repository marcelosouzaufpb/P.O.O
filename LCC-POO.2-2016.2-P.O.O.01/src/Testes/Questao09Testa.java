package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Questao09.Circulo;
import Questao09.FormaGeometrica;
import Questao09.Quadrados;
import Questao09.Retangulo;

public class Questao09Testa {

	static FormaGeometrica q1;
	static FormaGeometrica q2;
	static FormaGeometrica c1;

	@BeforeClass
	public static void onlyOnce() {
		q1 = new Quadrados(2.0);
		q2 = new Retangulo(2.0, 2.0);
		c1 = new Circulo(2.0);
	}

	@Test
	public void DeveriaCalcularAreaDoQuadrado() {
		assertEquals(4.0, q1.calculoDaAreaDaForma(), 0.001);
	}

	@Test
	public void DeveriaCalcularAreaDoRetangulo() {
		assertEquals(4.0, q2.calculoDaAreaDaForma(), 0.001);
	}

	@Test
	public void DeveriaCalcularAreaDoCirculo() {
		assertEquals(12.56, c1.calculoDoPerimetro(), 0.01);
	}

	@Test
	public void DeveriaCalcularPerimetroDoQuadrado() {
		assertEquals(8, q1.calculoDoPerimetro(), 0.001);
	}

	@Test
	public void DeveriaCalcularPerimetroDoRetangulo() {
		assertEquals(8.0, q2.calculoDoPerimetro(), 0.001);
	}

	@Test
	public void DeveriaCalcularPerimetroDoCirclo() {
		assertEquals(12.56, c1.calculoDoPerimetro(), 0.01);
	}

}
