package ej2_cursos;


class Curso {
    private String nombre;
    private int duracionEnHs;

    public Curso(String nombre, int duracionEnHs) {
        this.nombre = nombre;
        this.duracionEnHs = duracionEnHs;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso: " + ",Nombre: " + nombre + ", Duracion en Horas: " + duracionEnHs;
    }
    
    
}
