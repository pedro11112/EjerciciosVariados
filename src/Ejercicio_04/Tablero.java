/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Tablero {

    private double x;
    private double y;

    public Tablero(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void dirigirMovimiento() {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite a donde desea moverse");
                System.out.println("1. Arriba");
                System.out.println("2. Abajo");
                System.out.println("3. Izquierda");
                System.out.println("4. Derecha");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    moveUp();
                    break;
                case 2:
                    moveDown();
                    break;
                case 3:
                    moveLeft();
                    break;
                case 4:
                    moveRight();
                    break;
            }
            System.out.println("\nDesea continuar?(s/n): ");
            respuesta = sc.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
        toString();
    }

    public void moveUp() {
        y++;
        mostrarDatos();
    }

    public void moveDown() {
        y--;
        mostrarDatos();
    }

    public void moveLeft() {
        x--;
        mostrarDatos();
    }

    public void moveRight() {
        x++;
        mostrarDatos();
    }

    public void mostrarDatos() {
        System.out.println("(" + x + "," + y + ")");

    }

}
