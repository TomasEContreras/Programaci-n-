package ej4_tiendaonline;

public class Producto implements Vendible{
    private String nombre;
    private double precioBase;
    private String marca;

    public Producto(String nombre, double precioBase, String marca) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.marca = marca;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void mostrarInformacion(){
        
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio Base: " + precioBase);
        System.out.println("Marca: " + marca);
    }

    @Override
    public double calcularPrecioFinal() {
        
        return precioBase;
        
    }
}
