package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String cedula;
       String nombre;
       Integer opcion;
       Integer cantidadProducto;
       Double costoTotal =0.0;
       Double sumatoriaCostos=0.0;


       Scanner teclado = new Scanner(System.in);

        System.out.println("******* Peluchitos SA ********");
        System.out.println("1. Cumpleaños");
        System.out.println("2. Dia de la mujer");
        System.out.println("3. Baby showers");
        System.out.println("4. SALIR Y TERMINAR");

        do{

            System.out.println("Digita la opcion deseada: ");
            opcion = teclado.nextInt();


            if(opcion==1){

                System.out.println("Digita cuantos kit de cumplaeños deseas: ");
                cantidadProducto=teclado.nextInt();

                costoTotal=180000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;


            }else if(opcion==2){

                System.out.println("Digita cuantos kit de cumplaeños deseas: ");
                cantidadProducto=teclado.nextInt();

                costoTotal=60000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;


            }else if(opcion==3){

                System.out.println("Digita cuantos kit de cumplaeños deseas: ");
                cantidadProducto=teclado.nextInt();
                costoTotal=250000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;

            }else if(opcion==4){

                System.out.println("Gracias, hasta pronto.");
                System.out.println("El costo es de: $"+ sumatoriaCostos );


            }else{

                System.out.println("digita una opcion valida");
            }


        }while(opcion != 4);









    }
}