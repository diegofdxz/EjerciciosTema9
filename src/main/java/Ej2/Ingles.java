package Ej2;

public class Ingles implements Traduccion {

    @Override
    public void introducirDistancia() {
        System.out.println("Enter the distance in kilometers");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Enter the time in hours");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("The average speed is");
    }

    @Override
    public void finRespuesta() {
        System.out.println("km/h");
    }

}
