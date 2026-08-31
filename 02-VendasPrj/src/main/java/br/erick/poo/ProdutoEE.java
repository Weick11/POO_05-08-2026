package br.erick.poo;
import java.time.LocalDate;

public class ProdutoEE extends Produto{
    private int garantia;
    private LocalDate diaCompra;

    public ProdutoEE(int codigo, String nome, double preco, int garantia){
        super(codigo, nome, preco);
        this.garantia = garantia;
        diaCompra = LocalDate.now();
    }

    public String getGarantia(){
        return String.format("Nome do Produto: %s\nCodigo: %d\nDia da Compra: %s\nVencimento da Garantia: %s", super.getNome(), super.getCodigo(), diaCompra, diaCompra.plusDays(garantia));
    }

    public String toString(){
        return super.toString() + "Garantia: "+ garantia+ " dias.";
    }

}
