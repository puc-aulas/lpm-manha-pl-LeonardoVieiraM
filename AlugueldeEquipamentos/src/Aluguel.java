package AlugueldeEquipamentos.src;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.ArrayList;
import javax.sound.sampled.SourceDataLine;

public class Aluguel {
	
    private Date dataInicio;
    private Date dataFim;
    private Cliente cliente;

  
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	} 

// ler data de inicio
    public int[] inserirDataIncial(){
    Scanner scan = new Scanner(System.in);
	System.out.println("insira a ano de inicio");
	int anoInicial = scan.nextInt();
	System.out.println("anoInicial");

	System.out.println("insira a mes de inicio");
	int mesInicial = scan.nextInt();
	System.out.println("mesInicial");

	System.out.println("insira a dia de inicio");
	int diaInicial = scan.nextInt();
	System.out.println("diaInicial");

	return new int[]{anoInicial, mesInicial, diaInicial};
}
// ler data final
public int[] inserirDataFinal(){
    Scanner scan = new Scanner(System.in);
	System.out.println("insira o ano final");
	int anoFinal = scan.nextInt();
	System.out.println("anoFinal");

	System.out.println("insira o mes final");
	int mesFinal = scan.nextInt();
	System.out.println("mesFinal");

	System.out.println("insira o dia final");
	int diaFinal = scan.nextInt();
	System.out.println("diaFinal");

	return new int[]{anoFinal, mesFinal, diaFinal};
}
	
	public long calcularDias(int anoInicial,int mesInicial, int diaInicial,int anoFinal ,int mesFinal,int diaFinal){
	LocalDate starDate = LocalDate.of(anoInicial,mesInicial,diaInicial);
	LocalDate enDate = LocalDate.of(anoFinal,mesFinal,diaFinal);
	long diasDeAluguel = ChronoUnit.DAYS.between(starDate, enDate);
	return diasDeAluguel;
	}

	public long calcularValorDoAluguelPorDia(long diasDeAluguel, Equipamentos equipamento){
		long aluguel = equipamento.getValor() * diasDeAluguel;
		return aluguel;
	}
	
}
