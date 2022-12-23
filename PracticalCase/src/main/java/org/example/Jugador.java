package org.example;

public class Jugador {


    private String nombreJugador;
    private Dado dado;
    private Tablero tablero;

    public Jugador(String nombreJugador, Dado dado, Tablero tablero) {
        this.nombreJugador = nombreJugador;
        this.dado = dado;
        this.tablero = tablero;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }


}
