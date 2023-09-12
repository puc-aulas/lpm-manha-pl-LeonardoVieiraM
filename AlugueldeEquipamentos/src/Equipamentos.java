package AlugueldeEquipamentos.src;

public class Equipamentos {
    int codigo;
    String descricao = "";
    long valor;
    int quantidade;

    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public long getValor() {
        return valor;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(long valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static Equipamentos novoEquipamento (int codigo, String descricao, long valor, int quantidade){
        Equipamentos equipamentos = new Equipamentos();
        return equipamentos;
    }
}
