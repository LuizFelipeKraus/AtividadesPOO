
package atividadedataestudante;

public class Estudante {
    private int codigo;
    private String nome;
    private double notaMat ;
    private double notaPort;
    private double notaCien;
    public Estudante(){
    
    }
    public Estudante(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNotaMat(double notaMat) {
        this.notaMat = notaMat;
    }

    public void setNotaPort(double notaPort) {
        this.notaPort = notaPort;   
    }

    public void setNotaCien(double notaCien) {
        this.notaCien = notaCien;    
    }
    public double calculaMedia(){
        double media;
        media = (this.notaMat + this.notaCien + this.notaPort)/3.0;
        return media;
    }   
    public double calculaMedia(double pontuacaoExtra){
        double media;
        media = (this.notaMat + this.notaCien + this.notaPort + pontuacaoExtra)/3.0;
        return media;
    }
}
