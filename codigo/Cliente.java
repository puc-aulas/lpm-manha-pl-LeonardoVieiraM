package codigo;

public class Cliente{
	 private Long idCliente;
	 private String nome;
	 
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	 public static Cliente novoCliente (Long idCliente , String nome){
	        Cliente cliente = new Cliente();
	        return cliente;
	    }
}
