import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AniversarianteTest {
	Aniversariante a;

	@Before
	public void setUp() throws Exception {
		a = new Aniversariante("Marcelo", 02, 10, 1996);
	}

	@Test
	public void testEhAniversarianteDoMes() {
		assertFalse(a.ehAniversarianteDoMes(10));
	}

}
