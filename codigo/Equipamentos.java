package AlugueldeEquipamentos;

public class Equipamentos {
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

    public static Equipamentos novoEquipamento (int codigo, String descricao, double valor, int quantidade){
        Equipamentos equipamentos = new Equipamentos();
        return equipamentos;
    }
}
