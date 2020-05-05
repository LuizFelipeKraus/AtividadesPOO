package atividadeagregacaocomposicao;

public class produto {
    private int codigo;
    private double valor;
    private String descricao;

    public produto(int codigo, double valor, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }
    public double getValor(){
        return this.valor;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public int getCodigo(){
        return this.codigo;
    }

}
