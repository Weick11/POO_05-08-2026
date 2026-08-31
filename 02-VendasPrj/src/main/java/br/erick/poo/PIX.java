package br.erick.poo;

public class PIX extends Pagamento{
    private String chave;

    public PIX(double valor, String chave){
        super(valor);
        this.chave = chave;
    }

    public String getChave(){
        return chave;
    }

    public boolean processar(){
        System.out.println("Processando pagamento via PIX...");
        return true;
    }

    public String toString(){
        return super.toString() + "\nChave PIX: "+chave;
    }

}
