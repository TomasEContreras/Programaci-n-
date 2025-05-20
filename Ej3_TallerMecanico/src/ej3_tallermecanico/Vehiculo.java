package ej3_tallermecanico;


public class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public Vehiculo() {
    }
    
    public void mostarMarca(){
        System.out.println("Marca: "+marca);
    }
}
