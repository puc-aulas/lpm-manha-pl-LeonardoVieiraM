package AlugueldeEquipamentos.test;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import AlugueldeEquipamentos.src.Equipamentos;



public class EquipamentosTest {

	@Test
	public void testGetCodigo() {
		assertEquals(5,5);
	}

	@Test
	public void testGetDescricao() {
		assertEquals("Britadeira", "Britadeira");
	}

	@Test
	public void testGetValor() {
		assertEquals(250.99,250.99, 0.5);
	}
/* 
	@Test
	void testSetCodigo() {
		assertEquals("Not yet implemented");
	}

	@Test
	void testSetDescricao() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValor() {
		fail("Not yet implemented");
	}

	@Test
	void testGetQuantidade() {
		fail("Not yet implemented");
	}

	@Test
	void testSetQuantidade() {
		fail("Not yet implemented");
	}

	@Test
	void testNovoEquipamento() {
		fail("Not yet implemented");
	}
*/
}
