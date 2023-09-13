
import org.junit.Test;
import AlugueldeEquipamentos.src.Aluguel;
import AlugueldeEquipamentos.src.Equipamentos;

public class AluguelTest {
    private Aluguel aluguel;
    private Equipamentos equipamento;

    
    @Test
    public void testCalcularDias() {
        // Teste do método calcularDias
        int anoInicial = 2023;
        int mesInicial = 9;
        int diaInicial = 12;
        int anoFinal = 2023;
        int mesFinal = 9;
        int diaFinal = 15;

        long diasDeAluguel = aluguel.calcularDias(anoInicial, mesInicial, diaInicial, anoFinal, mesFinal, diaFinal);
        assertEquals(3, diasDeAluguel); // Espera-se que o aluguel seja de 3 dias
    }

    @Test
    public void testCalcularValorDoAluguelPorDia() {
        // Teste do método calcularValorDoAluguelPorDia
        int anoInicial = 2023;
        int mesInicial = 9;
        int diaInicial = 12;
        int anoFinal = 2023;
        int mesFinal = 9;
        int diaFinal = 15;

        long diasDeAluguel = aluguel.calcularDias(anoInicial, mesInicial, diaInicial, anoFinal, mesFinal, diaFinal);

        equipamento.setValor(50); // Defina o valor do equipamento para o teste

        long valorDoAluguel = aluguel.calcularValorDoAluguelPorDia(diasDeAluguel, equipamento);
        assertEquals(150, valorDoAluguel); // Espera-se que o valor do aluguel seja 150 (50 * 3)
    }
}
