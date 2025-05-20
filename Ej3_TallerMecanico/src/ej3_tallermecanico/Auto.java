package ej3_tallermecanico;

abstract class Auto extends Vehiculo implements Reparable{

    public Auto(String marca) {
        super(marca);
    }

    public Auto() {
    }
    
    public void reparar(){
        System.out.println("Reparando el auto de marca "+ marca);
    }
    
}
