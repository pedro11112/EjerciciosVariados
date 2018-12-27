/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipilicacionRusa;

/**
 *
 * @author eduardo
 */
public class MultiplicacionRusa {

    /*  Se instancia un objeto de la clase, Que inicializara un metodo para multiplicacion rusa
        MultiplicacionRusa op = new MultiplicacionRusa();
        op.multiplicacionRusa(22, 6);
     */
    public int multiplicacionRusa(int a, int b) {
        int suma = 0;
        while (a >= 1) {

            if (a % 2 != 0) {
                suma += b;
            }
            a /= 2;
            b *= 2;
        }
        System.out.println("La multiplicacion es: " + suma);
        return suma;

    }
}
