package br.erick.poo;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public abstract boolean processar();

    public String toString(){
        return String.format("Valor: %.2f\n",valor);
    }
}
