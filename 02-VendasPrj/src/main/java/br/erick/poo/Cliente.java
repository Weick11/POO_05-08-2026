package br.erick.poo;

public class Cliente {
    private String nome;
    private int codigo;

    public Cliente(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    }

    public Cliente(){
        this.nome = "Não Informado!";
        codigo = -1;
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
