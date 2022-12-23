package org.example;
import java.util.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);

        Dado dado=new Dado();
        Jugador jugadorA=new Jugador("Alberto",new Dado(),new Tablero());
        Jugador jugadorB=new Jugador("Maria",new Dado(),new Tablero());




        while (jugadorA.getTablero().getNumeroCasillaActual()!=100 || jugadorB.getTablero().getNumeroCasillaActual()!=100) {
            System.out.println("Jugador " + jugadorA.getNombreJugador() + " lanza tu dado...");
            jugadorA.getDado().lanzarDado();
            System.out.println("Tu numero es: " + jugadorA.getDado().getNumero_cara());
            jugadorA.getTablero().setNumeroCasillaActual(jugadorA.getTablero().getNumeroCasillaActual()+jugadorA.getDado().getNumero_cara());
            System.out.println("Tu casilla actual es: ");
            jugadorA.getTablero().getNumeroCasillaActual();
            if(jugadorA.getTablero().getData()[jugadorA.getTablero().getNumeroCasillaActual()-1]==Casilla.LADDER){

                    jugadorA.getTablero().moverPorEscalera();
            }
            if(jugadorA.getTablero().getData()[jugadorA.getTablero().getNumeroCasillaActual()-1]==Casilla.SNAKE){

                jugadorA.getTablero().descenderPorSerpiente();
            }
            try {

                Thread.sleep(50000);

            }
            catch (InterruptedException e) {

            }
            System.out.println("Jugador " + jugadorB.getNombreJugador() + " lanza tu dado...");
            jugadorB.getDado().lanzarDado();
            System.out.println("Tu numero es: " + jugadorB.getDado().getNumero_cara());
            jugadorB.getTablero().setNumeroCasillaActual(jugadorB.getTablero().getNumeroCasillaActual()+jugadorB.getDado().getNumero_cara());
            System.out.println("Tu casilla actual es: ");
            jugadorB.getTablero().getNumeroCasillaActual();
            if(jugadorB.getTablero().getData()[jugadorB.getTablero().getNumeroCasillaActual()-1]==Casilla.LADDER){

                jugadorB.getTablero().moverPorEscalera();
            }
            if(jugadorB.getTablero().getData()[jugadorB.getTablero().getNumeroCasillaActual()-1]==Casilla.SNAKE){

                jugadorB.getTablero().descenderPorSerpiente();
            }

        }












    }
}