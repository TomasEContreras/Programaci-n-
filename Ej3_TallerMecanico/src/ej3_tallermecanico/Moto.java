package ej3_tallermecanico;


abstract class Moto extends Vehiculo implements Reparable{

    public Moto(String marca) {
        super(marca);
    }

    public Moto() {
    }
   
    public void reparar(){
        System.out.println("Reparando la moto de marca "+marca);
    }
}
