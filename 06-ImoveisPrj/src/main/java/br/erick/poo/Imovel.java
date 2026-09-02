package br.erick.poo;

public abstract class Imovel {
    private String proprietario;
    private int areaConstruida;
    private Geo localizacao;
    private static double vr;

    public Imovel(String proprietario, int areaConstruida, double umVR, Geo localizacao){
        this.proprietario = proprietario;
        this.areaConstruida = areaConstruida;
        this.localizacao = localizacao;
        vr = umVR;
    }

    public static void setVR(double umVR){
        vr = umVR;
    }

    public static double getVR(){
        return vr;
    }

    public Geo getLocalizacao(){
        return localizacao;
    }

    public int getAreaConstruida(){
        return areaConstruida;
    }

    public String getProprietario(){
        return proprietario;
    }

    public abstract double calculaImposto();

    public String toString(){
        return String.format("Proprietário do Imóvel: %s\nÁrea de Construção %dm²\nLocalização: %s\nValor do Imposto %.2f/m²", proprietario, areaConstruida, localizacao.toString(), vr);
    }
}
