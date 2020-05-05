package atividadeagregacaocomposicao;
import java.util.Scanner;

public class AtividadeAgregacaoComposicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i,quantidade;
        pedido p3 = new pedido();
        produto p1[]=new produto[10];
        p1[0] = new produto(0,5.99,"Coca-Cola");
        p1[1] = new produto(1,4.50,"Salgado");
        p1[2] = new produto(2,3.00,"Chocolate");
        p1[3] = new produto(3,9.90,"Salame");
        p1[4] = new produto(4,6.75,"Detergente");
        p1[5] = new produto(5,1.85,"Bolacha");
        p1[6] = new produto(6,7.00,"Pepsi");
        p1[7] = new produto(7,8.45,"Danone");
        p1[8] = new produto(8,11.60,"Q-Boa");
        p1[9] = new produto(9,0.50,"Bala");
        for(i=0;i<10;i++){
            System.out.println("Código: "+p1[i].getCodigo()+"  Nome: "+p1[i].getDescricao()+"   Valor: "+p1[i].getValor() +"\n");
        }
        System.out.println("Menu de opção: ");
        System.out.println("1 - Adicionar item ao pedido.");
        System.out.println("2 - Apresentar o total do pedido.");
        System.out.println("Escolha: ");
        num = sc.nextInt();
        while(1==1){
            if(num == 1){
                System.out.println("Digite codigo do produto que você procura: ");
                i = sc.nextInt();
                System.out.println("Digite a quantidade de produtos: ");
                quantidade = sc.nextInt();
                itemPedido p2 = new itemPedido(p1[i],quantidade);
                p2.setitemPedido(p1[i].getValor(), quantidade);
                p3.adicionar_item(p2);
                p3.obter_total(p2.getNumero());
                System.out.println("Menu de opção: ");
                System.out.println("1 - Adicionar item ao pedido.");
                System.out.println("2 - Apresentar o total do pedido.");
                System.out.println("Escolha: ");
                num = sc.nextInt();
            }else if(num == 2){
                System.out.println("O valor total a pagar: "+p3.getValor_total());
                break;
            }else{
                System.out.println("Digite um valor válido");
                num = sc.nextInt();
            }
        }
    }
    
    
}
