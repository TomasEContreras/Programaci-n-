package ej1_biblioteca;


public class MaterialBiblioteca {
    
private String titulo;
private String autor;
private int anoDePublicacion;

    public MaterialBiblioteca(String titulo, String autor, int anoDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacion = anoDePublicacion;
    }

    public MaterialBiblioteca() {
    }

    @Override
    public String toString() {
        return  ", Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicacion: " + anoDePublicacion ;
    }
    
}
