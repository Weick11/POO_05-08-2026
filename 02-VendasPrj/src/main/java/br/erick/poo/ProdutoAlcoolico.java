package br.erick.poo;

public class ProdutoAlcoolico extends Produto{
    private static double TAXA_TRAGO = 2;

    public ProdutoAlcoolico(int codigo, String nome, double preco, double TAXA){
        super(codigo, nome, preco);
        TAXA_TRAGO = TAXA;
    }

    public double getTAXA(){
        return TAXA_TRAGO;
    }

    public void setTAXA(double TAXA){
        TAXA_TRAGO = TAXA;
    }

    @Override
    public double getPreco(){
        return (super.getPreco() * TAXA_TRAGO)/100;
    }

    public String toString(){
        return super.toString() +" Taxa para produtos alcoolicos: "+TAXA_TRAGO+"%";
    }

}
