package Ej2;

public class Espanol implements Traduccion {

    @Override
    public void introducirDistancia() {
        System.out.println("Introduzca la distancia en kilómetros");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduzca el tiempo en horas");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("La velocidad media es");
    }

    @Override
    public void finRespuesta() {
        System.out.println("km/h");
    }


}
