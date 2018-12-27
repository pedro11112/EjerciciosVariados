package Ejercicio_02;

public class Libro {
    private int ISBN;
    private String title;
    private String author;
    private int numPaginas;

    public Libro(int ISBN, String title, String author, int numPaginas) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.numPaginas = numPaginas;
    }

    public Libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getISBN() { 
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "El libro " + title
                + " con ISBN " + ISBN
                + " creado por el autor " + author
                + " tiene " + numPaginas + " páginas";
    }
}
