
package lutador;

import java.util.Random;

public class luta {
    private lutador1 desafiado;
    private lutador1 desafiante;
    private int rounds;
    private boolean aprovada;

    public lutador1 getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(lutador1 desafiado) {
        this.desafiado = desafiado;
    }

    public lutador1 getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(lutador1 desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(lutador1 l1,lutador1 l2){
        if(l1.getCategoria().equals(l2.getCategoria())&& l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante =l2;
        }else{
            this.aprovada= false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
           this.desafiado.apresentar();
           this.desafiante.apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
           System.out.println("======It's time======");
           switch(vencedor){
               case 0:
                   System.out.print("\nEmpatou\n======================================\n");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
               case 1:
                   System.out.println("========Vitória=======\n\n"+this.desafiado.getNome());
                   System.out.print("\n======================================\n");
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
               case 2:
                   System.out.println("========Vitória========\n\n"+this.desafiante.getNome());
                   System.out.print("\n======================================\n");
                   this.desafiado.perderLuta();
                   this.desafiante.ganharLuta();
                   break;
           }
        }else{
            System.out.println("Não pode ocorrer");
        }
    }
}
