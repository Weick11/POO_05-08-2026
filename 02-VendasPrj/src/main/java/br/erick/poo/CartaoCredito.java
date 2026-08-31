package br.erick.poo;

public class CartaoCredito extends Pagamento{
    private String numero;
    private String validade;
    private String bandeira;

    public CartaoCredito(double valor, String numero, String validade, String bandeira){
        super(valor);
        this.numero = numero;
        this.validade = validade;
        this.bandeira = bandeira;
    }

    public String getNumero(){
        return numero;
    }

    public String getValidade(){
        return validade;
    }

    public String getBandeira(){
        return bandeira;
    }

    public boolean processar(){
        System.out.println("Processando pagamento via Cartão de Crédito...");
        return true;
    }

    public String toString(){
        return String.format("Número: %s \nValidade: %s \nBandeira: %s",numero, validade, bandeira);
    }
}
