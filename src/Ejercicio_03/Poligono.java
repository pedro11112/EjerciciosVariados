/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_03;

import static Principal.MetodoMain.llenarRectangulo;
import static Principal.MetodoMain.llenarTriangulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public abstract class Poligono implements FiguraGeometrica {

    // Se llena el array dinamico con diferentes poligonos
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero Lados: " + numeroLados;
    }

    //Declaramos el metodo area como abstracto    
    public abstract double area();

    @Override
    public void llenarPoligono() {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    llenarTriangulo(5, 6, 7);
                    break;
                case 2:
                    llenarRectangulo(5, 7);
                    break;
            }
            System.out.println("\nDesea introducir otro poligono(s/n): ");
            respuesta = sc.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }

}
