package ej4_tiendaonline;

import java.util.ArrayList;

public class CarritoDeCompras {

    private ArrayList<Producto> carrito = new ArrayList();
    
    public void agregarProducto(Producto producto) {
        carrito.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : carrito) {
            producto.mostrarInformacion();
            System.out.println("\n");
        }
    }

    public double totalCompra() {
        double total = 0;
        for (Producto recorrer : carrito) {
            total += recorrer.calcularPrecioFinal();
        }
        return total;
    }
}

    
