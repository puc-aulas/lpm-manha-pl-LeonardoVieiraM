package AlugueldeEquipamentos.src;

public class Cliente{
	
    private String nome;
    private int cpf;
	
    public Cliente() {
        this.nome = "";
        this.cpf = 0;
    }

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setidcpf(int cpf) {
        this.cpf = cpf;
    }
	 public static Cliente novoCliente (int cpf , String nome){
	        Cliente cliente = new Cliente();
	        return cliente;
	    }
}
