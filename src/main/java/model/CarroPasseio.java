package model;

import java.util.Scanner;

public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio(String cor, String modelo, int peso, int velocidadeMaxKmh, int preco) {
        super(peso, velocidadeMaxKmh, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public CarroPasseio() {
        super(0, 0, 0);
        this.cor = "";
        this.modelo = "";
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void solicitarDados(){
        Scanner entrada = new Scanner(System.in);
        super.solicitarDados();
        
        
        
        System.out.println("Digite a cor do carro: ");
        cor = entrada.nextLine();

        System.out.println("Digite o modelo do carro: ");
        modelo = entrada.nextLine();
    }
    
    public void imprimirDados(){
    
        System.out.println(super.toString());
        
        System.out.println("Cor do veiculo: " + cor);
        System.out.println("Modelo do veiculo: " + modelo);
 }
}