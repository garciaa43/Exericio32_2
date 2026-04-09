package model;

import java.util.Scanner;

public class Veiculo {

    private int peso;
    private int velocidadeMaxKmh;
    private int preco;

    public Veiculo() {
        this(0, 0, 0);
    }

    public Veiculo(int peso, int velocidadeMaxKmh, int preco) {
        this.peso = peso;
        this.velocidadeMaxKmh = velocidadeMaxKmh;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public int getVelocidadeMaxKmh() {
        return velocidadeMaxKmh;
    }

    public int getPreco() {
        return preco;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelocidadeMaxKmh(int velocidadeMaxKmh) {
        this.velocidadeMaxKmh = velocidadeMaxKmh;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void solicitarDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso do veiculo: ");
        peso = entrada.nextInt();
        System.out.println("Digite a velocidade máxima em Km/h do veiculo: ");
        velocidadeMaxKmh = entrada.nextInt();
        System.out.println("Digite o preço do veiculo: ");
        preco = entrada.nextInt();

        // NÃO FECHAR ERRO: NoSuchElementException
        // entrada.close();
    }

    @Override
    public String toString() {
        return "Peso do veiculo: " + peso
                + "\nVelocidade máxima em Km/h: " + velocidadeMaxKmh
                + "\nPreço: " + preco;
    }

}
