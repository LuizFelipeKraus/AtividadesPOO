/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author lukra
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modeloConta c1 = new modeloConta();
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.dataDeAbertura = "04/06/2015";
        //c1.deposita(100);
        System.out.println(c1.recuperaDadosParaImpressao());
        
        modeloConta c2 = new modeloConta();
        c2.titular = "Hugo";
        c2.numero = 123;
        c2.agencia = "45678-9";
        c2.saldo = 50.0;
        c2.dataDeAbertura = "04/06/2015";
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
