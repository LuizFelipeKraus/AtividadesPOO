package aplicacaocaneta;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);   
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não pode rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
