/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_03;

import java.util.ArrayList;
/**
 *
 * @author Pedro
 */
public class PoligonoManager {
    
    // Se llena el array dinamico con diferentes poligonos
    private ArrayList<Poligono> poligonoList;

    public ArrayList<Poligono> getPoligonoList() {
        return poligonoList;
    }

    public void setPoligonoList(ArrayList<Poligono> poligonoList) {
        this.poligonoList = poligonoList;
    }
    
    public void agregarTrianguloConValores(int lado1, int lado2, int lado3) {
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligonoList.add(triangulo);
    }

    public void agregarRectanguloConValores(int lado1, int lado2) {
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligonoList.add(rectangulo);
    }
    
    public boolean agregarPoligono(Poligono poligono) {
        return poligonoList.add(poligono);
    }

    public void mostrarResultados() {
        for (Poligono poligono : poligonoList) {
            System.out.println(poligono.toString());
            System.out.println("Area = " + poligono.area() + "\n\n");
        }
    }
    
    //int cantidadInicialCorrecta = cantidadInicial < 0 ? 0 : cantidadInicial;
        
        /*
        if (cantidadInicialCorrecta < 0) {
            cantidadInicialCorrecta = 0;
        }
        */
    
    /// agrega poligonos alternadamente, siendo pares triangulos e impares rectangulos
    public void llenarPoligonosDePrueba(int cantidadInicial) {
        //validaciones
        
        if (cantidadInicial <= 0) {
            return;
        }
        
        poligonoList = new ArrayList<Poligono>();
        
        //operaciones
        
        for (int i = 0; i < cantidadInicial; i++) { 
            Poligono poligono;
            
            if (i % 2 == 0) {    
                poligono = new Triangulo(1*i, 1+i, 1+i);
            } else {
                poligono = new Rectangulo(1*i, 1+i);
            }
            
            this.agregarPoligono(poligono);
        }
    }
    
    public static void iniciarEjercicio() {
        PoligonoManager poligonoManager = new PoligonoManager();
        poligonoManager.llenarPoligonosDePrueba(6);
        poligonoManager.mostrarResultados();        
    }
    
}
