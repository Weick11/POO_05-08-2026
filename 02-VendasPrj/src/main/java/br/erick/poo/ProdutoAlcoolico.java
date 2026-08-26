package br.erick.poo;

public class ProdutoAlcoolico extends Produto{
    private final double TAXA_ALCOOLICO = 2;

    public ProdutoAlcoolico(int codigo, String nome, double preco){
        super(codigo, nome, preco);
    }

    public double getTAXA(){
        return TAXA_ALCOOLICO;
    }

    public String toString(){
        return super.toString() +" Taxa para produtos alcoolicos: 200%";
    }

}
