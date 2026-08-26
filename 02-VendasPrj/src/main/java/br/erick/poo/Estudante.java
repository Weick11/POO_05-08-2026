package br.erick.poo;

public class Estudante extends ClientePF {
    private String instituicao;

    public Estudante(int codigo, String nome, String cpf, String instituicao){
        super(codigo, nome, cpf);
        this.instituicao = instituicao;
    }

    public String getInstituicao(){
        return instituicao;
    }

    public String toString(){
        return super.toString() + "Instituição: "+ instituicao;
    }

}
