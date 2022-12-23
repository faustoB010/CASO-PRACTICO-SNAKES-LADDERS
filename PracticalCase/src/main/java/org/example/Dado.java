package org.example;

public class Dado {
    private int numero_cara;

    public Dado (){
        this.numero_cara=1;


    }

    public void lanzarDado(){
        this.numero_cara=(int)(Math.random()*6+1);

    }

    public int getNumero_cara() {
        return numero_cara;
    }

    public void setNumero_cara(int numero_cara) {
        this.numero_cara = numero_cara;
    }
}
