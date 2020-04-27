
package lutador;

public class Lutador {

    public static void main(String[] args) {
        lutador1 l[]=new lutador1[6];
        l[0] = new lutador1("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        l[1] = new lutador1("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new lutador1("Snapshadow","EUA",35,1.65,80.9,12,2,1);
        l[3]= new lutador1("Dead Code","Austrália",28,1.93,81.6,13,0,2);
        l[4] = new lutador1("Ufocabol","Brasil",37,1.70,119.3,5,4,3);
        l[5] = new lutador1("Nerdaard","EUA",30,1.81,105.7,12,2,4);
        luta primeira = new luta();
        primeira.marcarLuta(l[0],l[1]);
        primeira.lutar();
        l[0].status();
        l[1].status();
        luta dois = new luta();
        dois.marcarLuta(l[3],l[3]);
        dois.lutar();
    }
    
}
