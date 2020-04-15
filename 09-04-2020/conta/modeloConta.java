package conta;
public class modeloConta {
    public data dataDeAbertura;
    public String titular;
    public int numero;
    public String agencia;
    public double saldo;
    
    protected void saca(double valor){
        if(valor<=this.saldo){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("O valor solicitado é acima do valor registrado na conta");
        }
    }
    protected void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    protected double calculaRendimento(){
        this.saldo = this.saldo*0.1;
        return this.saldo;
    }
    protected String recuperaDadosParaImpressao(){
        String dados = "Titular: "+ this.titular;
        dados += "\nNúmero: "+ this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.dia;
        dados += "\nData de Abertura: " + this.dataDeAbertura.mes;
        dados += "\nData de Abertura: " + this.dataDeAbertura.ano;
        return dados;
    }
}
