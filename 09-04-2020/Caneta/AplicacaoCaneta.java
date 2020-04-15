package aplicacaocaneta;

public class AplicacaoCaneta {

   
    
    public static void main(String[] args) {
        /*Caneta c1 = new Caneta();
        c1.modelo = "fabercastell";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.tampar();
        c2.status();
        c2.rabiscar();*/
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
    }
    
}
