package ej1_biblioteca;

import java.util.ArrayList;

public class Main {

   
    public static void main(String[] args) {
        ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();
        
        materiales.add(new Libro("Martina Quirurjica","Martina De Laudo",2025,"1234567890"));
        materiales.add(new Revista("Tomas el Terrible","Tomas Contreras",2014,3));
        materiales.add(new DVD("Joel el Satiro","Joel Aramayo",2005,35));
        
        for(MaterialBiblioteca m : materiales){
            System.out.println(m);
             System.out.println("-------------------------");
        }
    }
    
}
