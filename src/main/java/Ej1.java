/*
1. El alquiler de bicis
El objetivo es crear un programa que permita a una empresa de alquiler de bicicletas, mostrar los modelos que se ofrecen en alquiler y los precios.

Se pueden alquilar bicicletas, segways y giroscopios. Para todos, es necesario conocer su marca, modelo y fecha de compra. Las bicicletas están equipadas con un sistema de cambio de marchas. Algunas tienen más velocidades que otras. Los segways y los giroscopios tienen cierta autonomía en kilómetros. Debido a su manillar, el Segway requiere que su piloto tenga una altura mínima.

Puede suponer que dispone de una clase LocalDate que permite gestionar la fecha de compra.

a. Las clases y sus atributos
Definir las clases necesarias para representar los distintos ciclos ofrecidos para el alquiler. Indicar los diferentes atributos de estos últimos y el posible carácter abstracto de determinadas clases.

b. Los métodos
Es necesario conocer la tarifa de alquiler de todos los ciclos.

bici	tarifa horaria de alquiler
bicicleta	4,90 €
segway	18,90 €
giroscopios	29,90 €
Agregar a las clases anteriores los métodos abstractos y concretos, necesarios para ello. También agregue un constructor y un método que será útil para mostrar estas bicis en cada uno de ellos.

c. Las normas
Todos los ciclos que se ofrecen en alquiler se almacenan en una tabla.

A continuación, se mostrará una vista previa de la pantalla que se genera cuando se navega por la tabla que contiene las bicis:

Estos son los ciclos que ofrecemos en alquiler:

- Bicis Lapierre speed 400 (1 año) 27 velocidades                  4,90€/hora
- Bicis Btwin riverside 900 (0 años) 10 velocidades                4,90€/hora
- Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min]     9,90€/hora
- Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min]     9,90€/hora
- Segways Immotion v8 (0 años) 40 km de autonomía                 18,90€/hora
- Segways Segway Ninebot One E+ (0 años)
  30 km de autonomía                                              18,90€/hora
 */

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Ej1 {
    public class Ciclo{
        protected String marca;
        protected String modelo;
        protected LocalDate fechaCompra;
        protected double tarifa;
        protected int numCiclo;
        public Ciclo(String marca, String modelo, LocalDate fechaCompra, double tarifa, int numCiclo){
            this.marca = marca;
            this.modelo = modelo;
            this.fechaCompra = fechaCompra;
            this.tarifa = tarifa;
            this.numCiclo = numCiclo;
        }
        public String getMarca(){
            return marca;
        }
        public String getModelo(){
            return modelo;
        }
        public LocalDate getFechaCompra(){
            return fechaCompra;
        }
        public double getTarifa(){
            return tarifa;
        }
        public void setMarca(String marca){
            this.marca = marca;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }
        public void setFechaCompra(LocalDate fechaCompra){
            this.fechaCompra = fechaCompra;
        }
        public void setTarifa(double tarifa){
            this.tarifa = tarifa;
        }
        public int getNumCiclo(){
            return numCiclo;
        }
        public void setNumCiclo(int numCiclo){
            this.numCiclo = numCiclo;
        }
        public String toString(){
            return numCiclo + "Marca: " + marca + " Modelo: " + modelo + " Fecha de compra: " + fechaCompra + " Tarifa: " + tarifa;
        }
    }
    public class Bicicleta extends Ciclo{
        protected int velocidades;

        public Bicicleta(String marca, String modelo, LocalDate fechaCompra, double tarifa, int numCiclo, int velocidades) {
            super(marca, modelo, fechaCompra, tarifa, numCiclo);
            this.velocidades = velocidades;
        }


        public int getVelocidades(){
            return velocidades;
        }
        public void setVelocidades(int velocidades){
            this.velocidades = velocidades;
        }
        public String toString(){


            return "Marca: " + getMarca() + " Modelo: " + getModelo() + " Fecha de compra: " + getFechaCompra() + " Tarifa: " + getTarifa() + " Velocidades: " + velocidades;

        }
    }
    public class Segway extends Ciclo{
        protected int autonomia;
        protected int alturaMinima;

        public Segway(String marca, String modelo, LocalDate fechaCompra, double tarifa, int numCiclo, int autonomia, int alturaMinima) {
            super(marca, modelo, fechaCompra, tarifa, numCiclo);
            this.autonomia = autonomia;
            this.alturaMinima = alturaMinima;
        }


        public int getAutonomia(){
            return autonomia;
        }
        public int getAlturaMinima(){
            return alturaMinima;
        }
        public void setAutonomia(int autonomia){
            this.autonomia = autonomia;
        }
        public void setAlturaMinima(int alturaMinima){
            this.alturaMinima = alturaMinima;
        }

        public void setTarifa(double tarifa){
            this.tarifa = tarifa;
        }
        public double getTarifa(){
            this.tarifa = tarifa;
            return 0;
        }
        public String toString(){
            return numCiclo + "Marca: " + getMarca() + " Modelo: " + getModelo() + " Fecha de compra: " + getFechaCompra() + " Tarifa: " + getTarifa() + " Autonomia: " + autonomia + " Altura minima: " + alturaMinima;
        }
    }
    public class Giroscopio extends Ciclo{
        protected int autonomia;

        public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double tarifa, int numCiclo, int autonomia) {
            super(marca, modelo, fechaCompra, tarifa, numCiclo);
            this.autonomia = autonomia;
        }

        public int getAutonomia(){
            return autonomia;
        }
        public void setAutonomia(int autonomia){
            this.autonomia = autonomia;
        }
        public String toString(){
            return numCiclo + "Marca: " + getMarca() + " Modelo: " + getModelo() + " Fecha de compra: " + getFechaCompra() + " Tarifa: " + getTarifa() + " Autonomia: " + autonomia;
        }
    }

    int numCiclo;
    public void agregarBicicleta(Bicicleta[] bicicletas,  String marca, String modelo, LocalDate fechaCompra, double tarifa, int velocidades){
        int indiceB = 0;

        numCiclo++;
        bicicletas[indiceB] = new Bicicleta(marca, modelo, fechaCompra, tarifa, velocidades, numCiclo);
        indiceB++;

    }
    public void agregarSegway(Segway[] segways,  String marca, String modelo, LocalDate fechaCompra, double tarifa, int autonomia, int alturaMinima){
       int indiceS = 0;
         numCiclo++;
        segways[indiceS] = new Segway(marca, modelo, fechaCompra, tarifa, autonomia, alturaMinima, numCiclo);
        indiceS++;
    }
    public void agregarGiroscopio(Giroscopio[] giroscopios, String marca, String modelo, LocalDate fechaCompra, double tarifa, int autonomia){
        int indiceG = 0;
        numCiclo++;
        giroscopios[indiceG] = new Giroscopio(marca, modelo, fechaCompra, tarifa, autonomia, numCiclo);
        indiceG++;
    }
public void mostrarBicicletas(Bicicleta[] bicicletas) {
    for (int i = 0; i < bicicletas.length; i++) {
        if (bicicletas[i] != null) {
            System.out.println(bicicletas[i].toString());
        }
    }
}
public void mostrarSegways(Segway[] segways) {
    for (int i = 0; i < segways.length; i++) {
        if (segways[i] != null) {
            System.out.println(segways[i].toString());
        }
    }

}
public void mostrarGiroscopios(Giroscopio[] giroscopios) {
    for (int i = 0; i < giroscopios.length; i++) {
        if (giroscopios[i] != null) {
            System.out.println(giroscopios[i].toString());
        }
    }

}
public void alquilarBicicleta(Bicicleta[] bicicletas){
    System.out.println("¿Que bicicleta desea alquilar?");
    mostrarBicicletas(bicicletas);
    Scanner sc = new Scanner(System.in);
    int opcion = sc.nextInt();
    opcion = opcion - 1;
    System.out.println("Tarifa: " + bicicletas[opcion].getTarifa());
    System.out.println("¿Cuantos dias desea alquilarla?");
    int dias = sc.nextInt();
    System.out.println("Total a pagar: " + bicicletas[opcion].getTarifa() * dias + "€");
}

public void alquilarSegway(Segway[] segways){
        Scanner sc = new Scanner(System.in);
    System.out.println("Cual es su altura?");
    int altura = sc.nextInt();
    System.out.println("¿Que segway desea alquilar?");
    mostrarSegways(segways);
    int opcion = sc.nextInt();
    if (altura < segways[opcion].getAlturaMinima()) {
        System.out.println("No puede alquilar este segway");
        return;
    }
    System.out.println("Tarifa: " + segways[opcion].getTarifa());
    System.out.println("¿Cuantos dias desea alquilarla?");
    int dias = sc.nextInt();
    System.out.println("Total a pagar: " + segways[opcion].getTarifa() * dias);
}
public void alquilarGiroscopio(Giroscopio[] giroscopios){
    System.out.println("¿Que giroscopio desea alquilar?");
    mostrarGiroscopios(giroscopios);
    Scanner sc = new Scanner(System.in);
    int opcion = sc.nextInt();
    System.out.println("Tarifa: " + giroscopios[opcion].getTarifa());
    System.out.println("¿Cuantos dias desea alquilarla?");
    int dias = sc.nextInt();
    System.out.println("Total a pagar: " + giroscopios[opcion].getTarifa() * dias);
}
    public static class Principal {
        Bicicleta[] bicicletas = new Bicicleta[100];



        Giroscopio[] giroscopios = new Giroscopio[100];
        Segway[] segways = new Segway[100];
        Ej1 ej1 = new Ej1();
        public void menu() {
            Scanner sc = new Scanner(System.in);
            while (true) {
                int opcion = 0;
                System.out.println("Bienvenido al menu de alquiler de ciclos");
            System.out.println("1. Agregar Ciclo");

            System.out.println("2. Mostrar Ciclos");
            System.out.println("3. Alquilar Ciclo");
            System.out.println("-1. Salir");
            opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("¿Que tipo de ciclo desea agregar?");
                        System.out.println("1. Bicicleta");
                        System.out.println("2. Segway");
                        System.out.println("3. Giroscopio");
                        System.out.println("-1. Salir");

                        int opcion2 = sc.nextInt();

                            switch (opcion2) {
                                case 1:

                                    System.out.println("Ingrese la marca: ");
                                    String marca = sc.nextLine();
                                    if (marca.isEmpty()) {
                                        marca = sc.nextLine();
                                    }
                                    System.out.println("Ingrese el modelo: ");
                                    String modelo = sc.nextLine();
                                    if (modelo.isEmpty()) {
                                        modelo = sc.nextLine();
                                    }
                                    System.out.println("Fecha de compra (dd/MM/yyyy): ");
                                    String dateString = sc.nextLine();

                                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    LocalDate fechaCompra = LocalDate.parse(dateString, formatter);
                                    System.out.println("Ingrese la tarifa: (usar , para separar decimales)");
                                    double tarifa = sc.nextDouble();

                                    System.out.println("Ingrese la cantidad de velocidades: ");
                                    int velocidades = sc.nextInt();


                                    ej1.agregarBicicleta(bicicletas, marca, modelo, fechaCompra, tarifa, velocidades);
                                    System.out.println("---Bicicleta agregada---");
                                    break;
                                case 2:

                                    System.out.println("Ingrese la marca: ");
                                    String marca2 = sc.nextLine();
                                    if (marca2.isEmpty()) {
                                        marca2 = sc.nextLine();
                                    }
                                    System.out.println("Ingrese el modelo: ");
                                    String modelo2 = sc.nextLine();
                                    if (modelo2.isEmpty()) {
                                        modelo2 = sc.nextLine();
                                    }
                                    System.out.println("Fecha de compra (dd/MM/yyyy): ");
                                    String dateString2 = sc.nextLine();
                                    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    LocalDate fechaCompra2 = LocalDate.parse(dateString2, formatter2);
                                    System.out.println("Ingrese la tarifa: ");
                                    double tarifa2 = sc.nextDouble();
                                    System.out.println("Ingrese la autonomia: ");
                                    int autonomia = sc.nextInt();
                                    System.out.println("Ingrese la altura minima: ");
                                    int alturaMinima = sc.nextInt();
                                    ej1.agregarSegway(segways, marca2, modelo2, fechaCompra2, tarifa2, autonomia, alturaMinima);
                                    break;
                                case 3:

                                    System.out.println("Ingrese la marca: ");
                                    String marca3 = sc.nextLine();
                                    if (marca3.isEmpty()) {
                                        marca3 = sc.nextLine();
                                    }
                                    System.out.println("Ingrese el modelo: ");
                                    String modelo3 = sc.nextLine();
                                    if (modelo3.isEmpty()) {
                                        modelo3 = sc.nextLine();
                                    }
                                    System.out.println("Fecha de compra (dd/MM/yyyy): ");
                                    String dateString3 = sc.nextLine();
                                    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    LocalDate fechaCompra3 = LocalDate.parse(dateString3, formatter3);
                                    System.out.println("Ingrese la tarifa: ");
                                    double tarifa3 = sc.nextDouble();
                                    System.out.println("Ingrese la autonomia: ");
                                    int autonomia3 = sc.nextInt();
                                    ej1.agregarGiroscopio(giroscopios, marca3, modelo3, fechaCompra3, tarifa3, autonomia3);

                                    break;
                                case -1:
                                    System.exit(0);
                                    break;
                            }

                        break;
                    case 2:
                        System.out.println("¿Que tipo de ciclo desea mostrar?");
                        System.out.println("1. Bicicleta");
                        System.out.println("2. Segway");
                        System.out.println("3. Giroscopio");
                        System.out.println("4. Todos");
                        System.out.println("-1. Salir");
                        int opcion3 = sc.nextInt();

                            switch (opcion3) {
                                case 1:
                                    System.out.println("Bicicletas: ");
                                    ej1.mostrarBicicletas(bicicletas);

                                    break;
                                case 2:
                                    System.out.println("Segways: ");
                                    ej1.mostrarSegways(segways);
                                    break;
                                case 3:
                                    System.out.println("Giroscopios: ");
                                    ej1.mostrarGiroscopios(giroscopios);
                                    break;
                                case 4:
                                    System.out.println("Todos los ciclos: ");
                                    System.out.println("Bicicletas: ");
                                    if (bicicletas[0] == null) {
                                        System.out.println("No hay bicicletas");
                                    }
                                    ej1.mostrarBicicletas(bicicletas);
                                    System.out.println("Segways: ");
                                    if (segways[0] == null) {
                                        System.out.println("No hay segways");
                                    }
                                    ej1.mostrarSegways(segways);
                                    System.out.println("Giroscopios: ");
                                    if (giroscopios[0] == null) {
                                        System.out.println("No hay giroscopios");
                                    }
                                    ej1.mostrarGiroscopios(giroscopios);


                                    break;
                                case -1:
                                    System.exit(0);
                                    break;
                            }

                        break;
                    case 3:
                        int opcion4;
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("¿Que tipo de ciclo desea alquilar?");
                        System.out.println("1. Bicicleta");
                        System.out.println("2. Segway");
                        System.out.println("3. Giroscopio");
                        System.out.println("-1. Salir");
                        opcion4 = sc2.nextInt();
                        switch (opcion4){
                            case 1:
                                if (bicicletas[0] == null) {
                                    System.out.println("No hay bicicletas");
                                    break;
                                }else {
                                    ej1.alquilarBicicleta(bicicletas);
                                }
                               break;
                            case 2:
                                if (segways[0] == null) {
                                    System.out.println("No hay segways");

                                }else {
                                    ej1.alquilarSegway(segways);
                                }

                                break;
                            case 3:
                                if (giroscopios[0] == null) {
                                    System.out.println("No hay giroscopios");
                                }else {
                                    ej1.alquilarGiroscopio(giroscopios);
                                }
                                break;
                            case -1:
                                System.exit(0);
                                break;
                        }

                        break;
                    case -1:
                        System.exit(0);
                        break;
                }
            }
        }
    }


    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.menu();
    }
}
