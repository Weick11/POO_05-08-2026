package br.erick.poo;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public String toString(){
        return String.format("Codigo: %d\nNome: %s\nPreço: %.2f",codigo, nome, preco);
    }
}
