package ej2_cursos;

public class Estudiante extends Persona {
        private int legajo;
        private Curso curso;

    public Estudiante(String nomYApellido, String DNI,int legajo, String nombCurso,int duracion ) {
        super(nomYApellido, DNI);
        this.legajo = legajo;
        this.curso = new Curso(nombCurso,duracion);
    }

    public Estudiante() {
    }

   


    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + ",Legajo: "+ legajo + curso;
    }

    
        
}
