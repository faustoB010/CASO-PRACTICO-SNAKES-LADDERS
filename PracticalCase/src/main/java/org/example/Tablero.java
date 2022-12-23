package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {

    private int numeroCasillaActual=1;

    private Casilla[] data;
    public Tablero() {
        this.data = new Casilla[100];


           a: for(int j=0;j<99;j++)

            {
                int variable_rndm = (int)Math.floor(Math.random()*(j-0+1)+0);
                variable_rndm+=j;
                if (j==variable_rndm) {
                    data[j] = Casilla.SNAKE;
                    continue a;
                };


        }

        b: for(int j=0;j<99;j++)
        {
            int variable_rndm = (int)Math.floor(Math.random()*(j-0+1)+0);
            variable_rndm+=j;
            if (j==variable_rndm && data[j] != Casilla.SNAKE) {
                data[j] = Casilla.LADDER;
                continue b;
            }
            else continue b;


        }

    }

    public int getNumeroCasillaActual() {
        return numeroCasillaActual;
    }

    public void setNumeroCasillaActual(int numeroCasillaActual) {
        this.numeroCasillaActual = numeroCasillaActual;
    }

    public Casilla[] getData() {
        return data;
    }

    public void setData(Casilla[] data) {
        this.data = data;
    }
    public void moverPorEscalera(){

        for (int i=this.numeroCasillaActual;true;i++){
            numeroCasillaActual++;
            if (data[numeroCasillaActual]==Casilla.LADDER);
            break;

        }
    }
    public void descenderPorSerpiente(){

        for (int i=this.numeroCasillaActual;true;i--){
            numeroCasillaActual--;
            if (data[numeroCasillaActual]==Casilla.SNAKE);
            break;

        }
    }


}
