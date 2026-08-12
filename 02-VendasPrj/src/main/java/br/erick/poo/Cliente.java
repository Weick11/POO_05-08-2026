package br.erick.poo;

public class Cliente {
    private String nome;
    private String codigo;

    public Cliente(String cpf, String nome){
        this.nome = nome;
        codigo = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public String toString(){
        return String.format("Nome: %s \nCodigo: %s",nome, codigo);
    }
}
