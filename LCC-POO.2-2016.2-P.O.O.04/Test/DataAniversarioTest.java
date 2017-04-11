import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DataAniversarioTest {
	DataAniversario d1;
	DataAniversario d2;
	DataAniversario d3;

	@Before
	public void setUp() throws Exception {
		d1 = new DataAniversario(23,07,1997); 
		d2 = new DataAniversario(23,07,1997); 
		d3 = new DataAniversario(23,06,1996); 
	}

	@Test
	public void testEqualsObject() {
		assertTrue(d1.equals(d2));
		assertFalse(d1.equals(d3));
		assertEquals(d1,d2);
		assertNotEquals(d1,d3);
	}

}
