package br.erick.poo;
import java.util.ArrayList;

public class Venda {
    private Cliente c;
    private ArrayList<ItemVenda> itens;

    public Venda(Cliente c){
        itens = new ArrayList<>();
        this.c = c;
    }

    public boolean inserir(Produto p, int quantidade){
        ItemVenda item = new ItemVenda(quantidade, p);
        itens.add(item);
        return true;
    }

    public double valorTotal(){
        double valor = 0;
        for(ItemVenda i: itens){
            if(i != null){
                valor += i.getValor();
            }
        }
        return valor;
    }

    public String toString(){
        String resultado = String.format("Cliente: %s\nProdutos:", c.toString());
        for(ItemVenda i: itens){
            if(i != null)
                resultado += i.toString();
        }
        return resultado;
    }
}
