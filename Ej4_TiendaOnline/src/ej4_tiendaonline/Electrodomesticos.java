package ej4_tiendaonline;

public class Electrodomesticos extends Producto{
    
    private int impuestoPorcentaje;

    public Electrodomesticos(int impuestoPorcentaje, String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
        this.impuestoPorcentaje = impuestoPorcentaje;
    }

    @Override
    public double calcularPrecioFinal(){ 
        double resultado = 0;
        
        resultado = (impuestoPorcentaje * getPrecioBase())/100;
        
        return getPrecioBase() + resultado;
    }
    
    @Override
    public void mostrarInformacion(){
        
        System.out.println("Porcentaje de impuesto: " + impuestoPorcentaje);
        super.mostrarInformacion();
    }
}