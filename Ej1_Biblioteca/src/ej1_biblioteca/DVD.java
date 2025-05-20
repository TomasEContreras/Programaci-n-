package ej1_biblioteca;


public class DVD extends MaterialBiblioteca {
    private int MinDuracion;

    public DVD(String titulo, String autor, int MinDuracion, int anoDePublicacion) {
        super(titulo, autor, anoDePublicacion);
        this.MinDuracion = MinDuracion;
    }

    public DVD() {
    }

    @Override
    public String toString() {
        return "\nDVD: " + super.toString()+ ", Duracion en Minutos: " + MinDuracion ;
    }
    
    
}
