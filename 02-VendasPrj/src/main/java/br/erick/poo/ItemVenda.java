package br.erick.poo;

public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(int qtde, Produto umProd) {
        this.quantidade = qtde;
        this.prod = umProd;
    }

    public double getValor() {
        return quantidade * prod.getPreco();
    }

    public String getDetalhe() {
        return String.format("(%d) %-15s \t %d X %6.2f    %6.2f",
                prod.getCodigo(), prod.getNome(), this.quantidade,
                prod.getPreco(), this.getValor());
    }

    @Override
    public String toString() {
        return "ItemVenda [quantidade=" + quantidade + ", prod=" + prod + "]";
    }

}
