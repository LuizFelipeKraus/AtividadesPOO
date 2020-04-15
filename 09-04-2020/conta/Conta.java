package conta;

public class Conta {
    public static void main(String[] args) {
        modeloConta c1 = new modeloConta();
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        data dataC1 = new data();
        c1.dataDeAbertura = dataC1;
        dataC1.dia = 15;
        dataC1.mes = 10;
        dataC1.ano = 2015;
        c1.deposita(100);
        System.out.println(c1.recuperaDadosParaImpressao());
        
        modeloConta c2 = new modeloConta();
        data dataC2 = new data();
        c2.titular = "Hugo";
        c2.numero = 123;
        c2.agencia = "45678-9";
        c2.saldo = 50.0;
        c2.dataDeAbertura = dataC2;
        dataC2.dia = 24;
        dataC2.mes = 05;
        dataC2.ano = 2017;
        System.out.println(c2.recuperaDadosParaImpressao());
        if(c1 == c2){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        modeloConta c3 = new modeloConta();
        c3.titular = "tiago";
        c3.saldo = 100;
        
        modeloConta c4= new modeloConta();
        c4.titular = "Arlindo";
        c4.saldo = 150;
        c3=c4;
        
        if(c3 == c4){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
    
}
