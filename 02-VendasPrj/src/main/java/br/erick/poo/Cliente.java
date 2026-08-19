package br.erick.poo;

public class Cliente {
    private String nome;
    private int codigo;

    public Cliente(int cpf, String nome){
        this.nome = nome;
        codigo = cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public String toString(){
        return String.format("Nome: %s \nCodigo: %s",nome, codigo);
    }
}
