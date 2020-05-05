package atividadeagregacaocomposicao;

public class itemPedido {
    private int quantidade;
    private produto produtos;
    private double num;
    
    public  itemPedido(produto produto,int quantidade){
        this.quantidade = quantidade;
        this.produtos = produto;
    }
    public void setitemPedido(double valor, int quntidade){
        this.num = valor * quantidade;
    }
    public double getNumero(){
        return this.num;
    }
   
}
