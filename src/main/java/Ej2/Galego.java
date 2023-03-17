package Ej2;

public class Galego implements Traduccion {

    @Override
    public void introducirDistancia() {
        System.out.println("Introduza a distancia en quilómetros");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduza o tempo en horas");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("A velocidade media é");
    }

    @Override
    public void finRespuesta() {
        System.out.println("km/h");
    }
}

