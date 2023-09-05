package AlugueldeEquipamentos.test;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import AlugueldeEquipamentos.src.Equipamentos;



public class EquipamentosTest {

	@Test
	public void testGetCodigo() {
		Equipamentos equipamentos = new Equipamentos();
		equipamentos.setCodigo(05);
		assertEquals(5,equipamentos.getCodigo());
	}

	@Test
	public void testGetDescricao() {
		Equipamentos equipamentos = new Equipamentos();
		equipamentos.setDescricao("Britadeira");
		assertEquals("Britadeira", equipamentos.getDescricao());
	}

	@Test
	public void testGetValor() {
		Equipamentos equipamentos = new Equipamentos();
		equipamentos.setValor(250.99);
		assertEquals(250.99,equipamentos.getValor(), 0.5);
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
