package Ej2;
import java.util.Scanner;
public class Principal {

    public void menu(){
        double distancia;
        double tiempo;
        double velocidad;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Elige un idioma");
            System.out.println("1. Español");
            System.out.println("2. Galego");
            System.out.println("3. Alemán");
            System.out.println("4. Inglés");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Traduccion t1 = new Espanol();
                    t1.introducirDistancia();
                    distancia = sc.nextDouble();
                    t1.introducirTiempo();
                    tiempo = sc.nextDouble();

                    t1.inicioRespuesta();
                    velocidad = distancia / tiempo;
                    System.out.println(velocidad);
                    t1.finRespuesta();


                    break;
                case 2:
                    Traduccion t2 = new Galego();
                    t2.introducirDistancia();
                    distancia = sc.nextDouble();
                    t2.introducirTiempo();
                    tiempo = sc.nextDouble();
                    t2.inicioRespuesta();
                    velocidad = distancia / tiempo;
                    System.out.println(velocidad);
                    t2.finRespuesta();

                    break;
                case 3:
                    Traduccion t3 = new Alemán();
                    t3.introducirDistancia();
                    distancia = sc.nextDouble();
                    t3.introducirTiempo();
                    tiempo = sc.nextDouble();
                    t3.inicioRespuesta();
                    velocidad = distancia / tiempo;
                    System.out.println(velocidad);
                    t3.finRespuesta();

                    break;
                case 4:
                    Traduccion t4 = new Ingles();
                    t4.introducirDistancia();
                    distancia = sc.nextDouble();
                    t4.introducirTiempo();
                    tiempo = sc.nextDouble();
                    t4.inicioRespuesta();
                    velocidad = distancia / tiempo;
                    System.out.println(velocidad);
                    t4.finRespuesta();


                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }
        }


    }
    public static void main(String[] args) {
        Principal p = new Principal();
        p.menu();
    }
}
