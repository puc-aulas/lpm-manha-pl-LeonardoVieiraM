package AlugueldeEquipamentos.src;
import java.util.Date;

public class Aluguel extends Equipamentos {
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
}
