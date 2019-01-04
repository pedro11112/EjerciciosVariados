/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Arrays {

    public static void invertirElementosDelArray() {
        int[] numero = {1, 2, 3, 4, 5, 6};

        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }

    public static void sumaRestayMediaDeArreglo() {
        float[] numero = {10, 20, 30, -40, -50, -60, 0, 0, 0};
        float suma_positivos = 0, suma_negativos = 0, media_positivos, media_negativos;
        int conteo_positivos = 0, conteo_negativos = 0, conteo_ceros = 0;

        for (int i = 0; i <= numero.length - 1; i++) {
            if (numero[i] == 0) {
                conteo_ceros++;
            } else if (numero[i] < 0) {
                suma_negativos += numero[i];
                conteo_negativos++;
            } else {
                suma_positivos += numero[i];
                conteo_positivos++;
            }
        }
        System.out.println(suma_positivos + " " + suma_positivos / conteo_positivos);
        System.out.println(suma_negativos + " " + suma_negativos / conteo_negativos);
    }

    public static void iteracionde1a100() {
        int[] numeros = new int[100];
        int suma = 0;
        float media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] = i + 1);
            suma += numeros[i];
        }
        System.out.println("Suma: " + suma);
        media = (float) suma / numeros.length;
        System.out.println("Media: " + media);
    }

    public static void insertNumberInArray() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        int[] numeros = new int[n];

        int num = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserte un numero en la posicion " + i);
            do {
                num = entrada.nextInt();

                if (!(num >= 0 && num <= 10)) {
                    System.out.println("Error.Solo numeros del 1 al 10\n"
                            + "Inserte un numero en la posicion " + i);
                }
            } while (!(num >= 0 && num <= 10));
            numeros[i] = num;
        }
        // Muestra los numeros insertados
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void insertRandomNumberInArray() {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((float) Math.random() * 10);
            System.out.println(numeros[i]);
        }
    }

    public static void convertirNumerosASCIIaLetras() {
        Scanner entrada = new Scanner(System.in);
        char[] caracteres = new char[25];

        for (int i = 0; i < caracteres.length; i++) {

            caracteres[i] = (char) (i + 65);
        }

        System.out.println("Ingrese un numero entre 0 y " + caracteres.length);
        int num = entrada.nextInt();

        String cadena = "";

        while (num != -1) {

            if (num >= 0 && num <= caracteres.length) {
                cadena += caracteres[num];
            } else {
                System.out.println("Ingrese un numero valido o -1 para salir");
            }
            System.out.println("Ingrese un numero entre 0 y " + caracteres.length);
            num = entrada.nextInt();
        }
        System.out.println("La cadena es: " + cadena);
    }

}
