
package conta;


public class modeloConta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;
    
    void saca(double valor){
        if(valor<=this.saldo){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("O valor solicitado é acima do valor registrado na conta");
        }
    }
    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    double calculaRendimento(){
        this.saldo = this.saldo*0.1;
        return this.saldo;
    }
    String recuperaDadosParaImpressao(){
        String dados = "Titular: "+ this.titular;
        dados += "\nNúmero: "+ this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura; 
        return dados;
    }
}
