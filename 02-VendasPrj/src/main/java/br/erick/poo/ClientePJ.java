package br.erick.poo;

public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ(int codigo, String nome, String cnpj){
        super(codigo, nome);
        this.cnpj = cnpj;
    }

    public String getCNPJ(){
        return cnpj;
    }

    public String toString(){
        return super.toString() + " CNPJ: "+cnpj;
    }

}
