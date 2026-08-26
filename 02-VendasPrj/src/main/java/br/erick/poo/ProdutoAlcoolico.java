package br.erick.poo;

public class ProdutoAlcoolico extends Produto{
    private final double TAXA_TRAGO = 2;

    public ProdutoAlcoolico(int codigo, String nome, double preco){
        super(codigo, nome, preco);
    }

    public double getTAXA(){
        return TAXA_TRAGO;
    }

    @Override
    public double getPreco(){
        return super.getPreco() * TAXA_TRAGO;
    }

    public String toString(){
        return super.toString() +" Taxa para produtos alcoolicos: 200%";
    }

}
