package br.erick.poo;

public class ProdutoEE extends Produto{
    private int garantia;

    public ProdutoEE(int codigo, String nome, double preco, int garantia){
        super(codigo, nome, preco);
        this.garantia = garantia;
    }

    public int getGarantia(){
        return garantia;
    }

    public String toString(){
        return super.toString() + "Garantia: "+ garantia;
    }

}
