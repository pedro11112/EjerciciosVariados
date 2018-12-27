package Ejercicio_01;

import static Ejercicio_01.Atleta.indiceMejorTiempo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int id;
        float tiempo;
        int indiceFinalTiempo;
        int concursantes = 5;

        //Creamos los objetos para los atletas. 
        Atleta participante[] = new Atleta[concursantes];
        for (int i = 0; i < participante.length; i++) {
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del participante " + (i + 1) + ": ");
            System.out.print("Introduzca Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca el id: ");
            id = entrada.nextInt();
            System.out.print("introduzca el tiempo de llegada a la meta final: ");
            tiempo = entrada.nextFloat();

            participante[i] = new Atleta(id, nombre, tiempo);
        }

        indiceFinalTiempo = indiceMejorTiempo(participante);

        System.out.println("\nEl Jugador con el mejor tiempo es : ");
        System.out.println(participante[indiceFinalTiempo].mostrarDatos());

    }

}
