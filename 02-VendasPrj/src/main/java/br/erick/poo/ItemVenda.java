package br.erick.poo;

public class ItemVenda {
    private Produto p;
    private int quantidade;

    public ItemVenda(int quantidade, Produto p){
        this.p = p;
        this.quantidade = quantidade;
    }

    public double getValor(){
        return quantidade*p.getPreco();
    }

    public String toString(){
        return String.format("Quantidade: %d\n" + p.toString(), quantidade);
    }
}
