package Ej2;
/*
Reanudar el ejercicio del cálculo de la velocidad media para hacerlo plurilingüe.

El algoritmo, primero pide al usuario el idioma y luego se comunica con él en ese idioma.

Para hacer esto, cree una interfaz Traduccion que contenga cuatro métodos abstractos, introducirDistancia(), introducirTiempo(), inicioRespuesta() y finRespuesta(). Cree una clase que implemente esta interfaz para cada idioma deseado. Finalmente modifique el algoritmo en consecuenc
 */
public interface Traduccion {

    public abstract void introducirDistancia();
    public abstract void introducirTiempo();
    public abstract void inicioRespuesta();
    public abstract void finRespuesta();
}
