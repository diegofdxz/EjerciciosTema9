package Ej2;

public class Alemán implements Traduccion {

    @Override
    public void introducirDistancia() {
        System.out.println("Geben Sie die Entfernung ein in Kilometer");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Geben Sie die Zeit ein in Stunden");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Die durchschnittliche Geschwindigkeit ist");
    }

    @Override
    public void finRespuesta() {
        System.out.println("km/h");
    }


}
