/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_03;

/**
 *
 * @author eduardo
 */
public interface FiguraGeometrica {

    void llenarPoligono();

    public static void main(String[] args) {
        llenarPoligono();
        mostrarResultados();
    }

    public static void llenarTriangulo(int lado1, int lado2, int lado3) {
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(int lado1, int lado2) {
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }

    public static void mostrarResultados() {
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area = " + poli.area());
            System.out.println("");
        }
    }

}
