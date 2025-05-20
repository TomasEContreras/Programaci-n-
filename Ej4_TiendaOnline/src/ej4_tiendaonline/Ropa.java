package ej4_tiendaonline;

public class Ropa extends Producto{
    
    private int descuentoPorcentaje;

    public Ropa(int descuentoPorcentaje, String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
    
    @Override
    public double calcularPrecioFinal(){
        double resultado = 0;
        
        resultado = (getPrecioBase() * descuentoPorcentaje)/100;
        
        return getPrecioBase() - resultado;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Porcentaje de descuento: " + descuentoPorcentaje);
        super.mostrarInformacion();
        
    }
 
}
