package br.erick.poo;

public class ClientePF extends Cliente{
    private String cpf;

    public ClientePF(int codigo, String nome, String cpf){
        super(codigo, nome);
        this.cpf = cpf;
    }

    public String getCPF(){
        return cpf;
    }

    public String toString(){
        return super.toString() + "CPF: "+ cpf;
    }
}
