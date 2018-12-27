package Ejercicio_01;

public class Atleta {

    private int id;
    private String nombre;
    private float tiempo;

    public Atleta(int id, String nombre, float tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nNumero de atleta:  " + id + "\n Tiempo de carrera: " + tiempo;
    }

    public static int indiceMejorTiempo(Atleta participante[]) {
        float tiempo;
        int indice = 0;

        tiempo = participante[0].getTiempo();
        for (int i = 1; i < participante.length; i++) {
            if (participante[i].getTiempo() < tiempo) {
                tiempo = participante[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }

}
