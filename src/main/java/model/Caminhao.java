
package model;

import java.util.Scanner;


public class Caminhao extends Veiculo{
    
    private int cargaMaxTon;
    private int alturaMax;
    private int comprimento;

    public Caminhao(int cargaMaxTon, int alturaMax, int comprimento, int peso, int velocidadeMaxKmh, int preco) {
        super(peso, velocidadeMaxKmh, preco);
        this.cargaMaxTon = cargaMaxTon;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public Caminhao() {
        super(0, 0,0);
        this.cargaMaxTon = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    public int getCargaMaxTon() {
        return cargaMaxTon;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setCargaMaxTon(int cargaMaxTon) {
        this.cargaMaxTon = cargaMaxTon;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    public void solicitarDados(){
        Scanner entrada = new Scanner(System.in);
        super.solicitarDados();
        
        
        
        System.out.println("Digite a carga máxima do caminhão: ");
        cargaMaxTon = entrada.nextInt();

        System.out.println("Digite a altura máxima do caminhão: ");
        alturaMax = entrada.nextInt();
        
        System.out.println("Digite o comprimento do caminhão: ");
        comprimento = entrada.nextInt();
    }
    
    public void imprimirDados(){
    
        System.out.println(super.toString());
        
        System.out.println("Carga máxima do caminhão: " + cargaMaxTon);
        System.out.println("Altura máxima do caminhão: " + alturaMax);
        System.out.println("Comprimento do caminhão: " + comprimento);
 }
    
}
