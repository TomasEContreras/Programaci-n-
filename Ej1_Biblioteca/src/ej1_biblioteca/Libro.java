package ej1_biblioteca;

public class Libro extends MaterialBiblioteca {
    private String ISBN;

    public Libro(String ISBN, String titulo, int anoDePublicacion, String autor) {
        super(titulo, autor, anoDePublicacion);
        this.ISBN = ISBN;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "\nLibro: " + super.toString() + ", ISBN: " + ISBN;
    }
    
    
}
