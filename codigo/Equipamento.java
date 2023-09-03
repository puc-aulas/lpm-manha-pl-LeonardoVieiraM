package codigo;

public class Equipamento {
    int codigo;
    String descricao = "";
    double valor;
    int quantidade;

    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static Equipamento novoEquipamento (int codigo, String descricao, double valor, int quantidade){
        Equipamento equipamento = new Equipamento();
        return equipamento;
    }
}
