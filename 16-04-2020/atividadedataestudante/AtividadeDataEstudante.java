package atividadedataestudante;

import java.io.PrintStream;
import java.util.Scanner;

public class AtividadeDataEstudante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante n1= new Estudante(1,"Arlindo");
        n1.setNotaCien(4);
        n1.setNotaMat(7);
        n1.setNotaPort(11);
        System.out.println("Código: "+n1.getCodigo());
        System.out.println("Nome: "+n1.getNome());
        System.out.println("Média nota: " + n1.calculaMedia());
        System.out.println("Média nota com ponto extra: " + n1.calculaMedia(5));
        
        Data n2 = new Data();
        n2.setData(32, 5, 2001);
        System.out.println("data: "+ n2.getData());
        
        Data n3= new Data();
        n3.setData(29, 2, 2000);
        System.out.println("data: "+ n3.getData());
        
        Data n4= new Data();
        n4.setData(29, 2, 2001);
        System.out.println("data: "+ n4.getData());
    }
    
}
