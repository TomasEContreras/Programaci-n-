package ej2_cursos;

import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args) {
     ArrayList<Estudiante> pibes= new ArrayList();
     
     pibes.add(new Estudiante("Tomas Contreras","46145832",15515,"Progrmacion II",30 ));
     pibes.add(new Estudiante("Gordo Arduna","47232322",15516,"Algebra",32));
     pibes.add(new Estudiante("Farfan Josesnhi","38234012",15543,"Analisis M",74));
     
     for(Estudiante e : pibes){
         System.out.println(e);
         System.out.println("-------------------------------");
     }
    }
    
}
