package main;

import model.Caminhao;
import model.CarroPasseio;
import model.Veiculo;

public class Main {

    public static void main(String[] args) {
        
        //  Veiculo v = new Veiculo();
        //  v.solicitarDados();
        //  System.out.println("------------------");
        //  System.out.println(v.toString());
        //  System.out.println("------------------");
        //  System.out.println(v);
        //  System.out.println("------------------");
       
        // System.out.println("------------------");
        // CarroPasseio c = new CarroPasseio();
        // c.solicitarDados();
        // System.out.println("------------------");
        // c.imprimirDados();
        // System.out.println("------------------");
        
        
        Caminhao caminhao = new Caminhao();
        caminhao.solicitarDados();
        System.out.println("------------------");
        caminhao.imprimirDados();
        System.out.println("------------------");
    }
}
