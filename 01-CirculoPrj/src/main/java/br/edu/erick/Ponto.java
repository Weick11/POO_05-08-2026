package br.edu.erick;

public class Ponto {
    private double pontox, pontoy;

    public Ponto(double x, double y){
        this.pontox = x;
        this.pontoy = y;
    }

    public double getX(){
        return pontox;
    }

    public double getY(){
        return pontoy;
    }

    public void mover(double novoX, double novoY){
        pontox = novoX;
        pontoy = novoY;
    }

    public String toString(){
        return "Ponto ("+pontox+", "+pontoy+")";
    }
}
