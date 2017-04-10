package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Questao08.Data;
import Questao08.Funcionario;
import Questao08.Gerente;
import junit.framework.Assert;

public class Questao08Testa {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculaImpostoGerente() {
		Data data = new Data(2, 3, 4);
		Funcionario gerente = new Gerente("marcelo", data, 10.0);
		Assert.assertEquals(0.5, gerente.calculaImposto());
	}

	@Test
	public void testCalculaImpostoFuncionario() {
		Data data = new Data(2, 3, 4);
		Funcionario f = new Funcionario("marcelo", data, 10.0);
		Assert.assertEquals(0.3, f.calculaImposto());
	}

}
