package br.erick.poo;

public class Residencial extends Imovel{
    private int areaTerreno;

    public Residencial(String proprietario, int areaConstruida, int vr, Geo localizacao, int areaTerreno){
        super(proprietario, areaConstruida, vr, localizacao);
        this.areaTerreno = areaTerreno;
    }

    public double calculaImposto(){
        double imposto = 0;
        if(this.getAreaConstruida() > 200 && this.getAreaConstruida() <= 1000)
            imposto = getVR() * (this.getAreaConstruida() - 200);
            if(areaTerreno > 1000)
                imposto += 100;
        return imposto;
    }

    @Override
    public String toString(){
        String resultado = String.format("%s\nÁrea do Terreno: %d\n", super.toString(), areaTerreno);
        if(areaTerreno > 1000) resultado += String.format("Acréscimo de R$%.2f ao imposto do terreno", getVR()*100);
        resultado += String.format("Valor Total do Imposto: %.2f", calculaImposto());
        return resultado;
    }
}

    // imóveis com até 200 m2 de área construída (inclusive) são isentos de imposto;
    // imóveis com mais de 200 m2 pagam uma VR (valor de referência) para cada metro quadrado que exceda os 200 m2 que são isentos;
    // adicionalmente, se a área do terreno for superior a 1000 m2, uma taxa adicional de 100 VRs é aplicada;

