package ej1_biblioteca;

public class Revista extends MaterialBiblioteca {
    private int numeroDeEdicion; 

    public Revista(String titulo, String autor, int numeroDeEdicion, int anoDePublicacion) {
        super(titulo, autor, anoDePublicacion);
        this.numeroDeEdicion = numeroDeEdicion;
    }

    public Revista() {
    }

    @Override
    public String toString() {
        return "\nRevista: "+ super.toString() + ", Numero de Edicion: " + numeroDeEdicion ;
    }
    
    
}
