package br.erick.poo;

public class Comercial extends Imovel{

    public Comercial(String proprietario, int areaConstruida, double vr, Geo localizacao){
        super(proprietario, areaConstruida, vr, localizacao);
    }

    public double calculaImposto(){
        double imposto = 0;
        if(this.getAreaConstruida() > 200 && this.getAreaConstruida() <= 1000)
            imposto = getVR() * (this.getAreaConstruida() - 200);
        return imposto;
    }

    @Override
    public String toString() {
        return String.format("%s\nImposto do Imóvel: %.2f", super.toString(), calculaImposto());
    }
}
