package AlugueldeEquipamentos;

public class Cliente{
	 private String idCliente;
	 private String nome;
	 
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
	public String getIdCliente() {
		return idCliente;
	}
	public String setIdCliente(String idCliente) {
		return idCliente;
	}
	 public static Cliente novoCliente (String idCliente , String nome){
	        Cliente cliente = new Cliente();
	        return cliente;
	    }
}