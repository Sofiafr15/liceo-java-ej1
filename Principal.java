package com.liceolapaz.des.sfr;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Escribir menú
        escribirMenu();

        //Pedir opción del menú
        pedirOpcion();

        //Leer opción y guardar mensaje
        int opcion = leerOpcion();

        //Escribir mensaje sobre opción escogida
        escribirMensaje(opcion);

        //Generar número aleatorio para que el usuario lo adivine
        generarNumeroAleatorio(1, 10);
        generarNumeroAleatorio2(1, 50);

        //Guardar ese número
        int numeroAleatorio = generarNumeroAleatorio(1, 10);
        int numeroAleatorio2 = generarNumeroAleatorio(1, 50);
    }

    private static int generarNumeroAleatorio2(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) - min;
    }


    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) - min;
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();

    }
    private static void escribirMensaje(int opcion) {
        switch (opcion)
        { case 3:
                System.out.println("¡Hasta la próxima!");
                System.exit(0);
                break;
            case 1:
                int numeroIntentos = 0;
                int maximoIntentos = 3;
                int numeroAleatorio = 0;
                numeroAleatorio = generarNumeroAleatorio(1,10);
                int numeroUsuario = 0;
                while (numeroIntentos < maximoIntentos ) {
                    //Pedir al Usuario que escoja un número que coincida con el número aleatorio generado
                        pedirNumeroUsuario();
                        //Leer y guardar el número escrito por el usuario
                        numeroUsuario = pedirNumeroAleatorio();
                        //Si el usuario acierta el número
                        if (numeroAleatorio == numeroUsuario) {
                            System.out.println("Ha acertado el número en " + numeroIntentos + " intento(s)");
                            break;
                        }
                            //Damos pistas al usuario
                            else if (numeroAleatorio > numeroUsuario) {
                                System.out.println("El número a adivinar es mayor");
                            }
                            else {
                                System.out.println("El número a adivinar es menor");
                            }
                        //Si el usuario no acierta el número

                        numeroIntentos++;
                }

                        //Si se acaban los intentos
                        if (numeroAleatorio != numeroUsuario) {
                        System.out.println("No ha acertado el número en los intentos propuestos, el número era: "+ numeroAleatorio);
                        }
                    break;

            case 2:
                int numeroIntentos2 = 0;
                int maximoIntentos2 = 5;
                int numeroAleatorio2 = 0;
                numeroAleatorio = generarNumeroAleatorio2(1,50);
                int numeroUsuario2 = 0;
                while (numeroIntentos2 < maximoIntentos2 ) {

                    //Pedir al Usuario que escoja un número que coincida con el número aleatorio generado
                    pedirNumeroUsuario();
                    //Leer y guardar el número escrito por el usuario
                    numeroUsuario2 = pedirNumeroAleatorio();
                    //Si el usuario acierta el número
                    if (numeroAleatorio2 == numeroUsuario2) {
                        System.out.println("Ha acertado el número en " + numeroIntentos2 + " intento(s)");
                        break;
                    }
                    //Damos pistas al usuario
                    else if (numeroAleatorio2 > numeroUsuario2) {
                        System.out.println("El número a adivinar es mayor");
                    }
                    else {
                        System.out.println("El número a adivinar es menor");
                    }
                    //Si el usuario no acierta el número

                    numeroIntentos2++;
                }

                //Si se acaban los intentos
                if (numeroAleatorio2 != numeroUsuario2) {
                    System.out.println("No ha acertado el número en los intentos propuestos, el número era: "+ numeroAleatorio);
                }
                break;
             }
    }

    private static int pedirNumeroAleatorio() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeroUsuario() {
        System.out.print("Escriba el número: ");
    }

    private static void pedirOpcion() {
        System.out.println("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println
                ("ADIVINA EL NÚMERO\n" +
                        "1.Del 1 al 10 (3 intentos)\n" +
                        "2.Del 1 al 50 (5 intentos)\n" +
                        "3.Salir\n");
    }
    }



