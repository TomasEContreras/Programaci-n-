package ej2_cursos;


public class Persona {

    private String nomYApellido;
    private String DNI;
    

    public Persona(String nomYApellido, String DNI) {
        this.nomYApellido = nomYApellido;
        this.DNI = DNI;
       
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return  "Nombre y Apellido: " + nomYApellido + ", DNI:" + DNI ;
    }
    
    
}
