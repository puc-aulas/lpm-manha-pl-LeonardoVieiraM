package AlugueldeEquipamentos.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;
import AlugueldeEquipamentos.src.Cliente;

public class ClienteTest {

	 @Test
    public void testConstrutorPadrao() {
        Cliente cliente = new Cliente();
        assertNotNull(cliente);
        assertEquals("", cliente.getNome());
        assertEquals(0, cliente.getCpf());
    }

    @Test
    public void testConstrutorComParametros() {
        String nome = "João";
        int idCpf = 123456789;

        Cliente cliente = new Cliente(nome, idCpf);
        assertNotNull(cliente);
        assertEquals(nome, cliente.getNome());
        assertEquals(idCpf, cliente.getCpf());
    }

    @Test
    public void testGetSetNome() {
        Cliente cliente = new Cliente();
        String novoNome = "Maria";

        cliente.setNome(novoNome);
        assertEquals(novoNome, cliente.getNome());
    }

    @Test
    public void testGetSetidCpf() {
        Cliente cliente = new Cliente();
        int novoidCpf = 987654321;

        cliente.setidcpf(novoidCpf);
        assertEquals(novoidCpf, cliente.getCpf());
    }

    @Test
    public void testNovoCliente() {
        int novoCpf = 123456789;
        String novoNome = "José";

        Cliente cliente = Cliente.novoCliente(novoCpf, novoNome);
        assertNotNull(cliente);
        assertEquals(novoCpf, cliente.getCpf());
        assertEquals(novoNome, cliente.getNome());
    }

}
