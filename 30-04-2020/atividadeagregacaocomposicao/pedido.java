package atividadeagregacaocomposicao;

public class pedido {
    private double valor_total = 0;
    private itemPedido itemPedido;
    
    public void adicionar_item(itemPedido itemPedido){
       this.itemPedido = itemPedido;
    }
    public double obter_total(double valor){
      this.valor_total = this.valor_total + this.itemPedido.getNumero();
      return this.valor_total;
    }
    public double getValor_total(){
        return this.valor_total;
    }
}
