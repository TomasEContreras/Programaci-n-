package ej4_tiendaonline;

public class Main {

    public static void main(String[] args) {

        CarritoDeCompras carrito = new CarritoDeCompras();

        carrito.agregarProducto(new Electrodomesticos(45, "Aire Acondicionado", 210000.99, "Samsung"));
        carrito.agregarProducto(new Ropa(22, "Camisa", 35000.49, "Zara"));
        carrito.agregarProducto(new Electrodomesticos(33, "Heladera", 295000.00, "Whirlpool"));
        carrito.agregarProducto(new Electrodomesticos(19, "Horno Eléctrico", 87000.00, "Philips"));
        carrito.agregarProducto(new Ropa(17, "Campera", 90000.00, "North Face"));
        carrito.agregarProducto(new Ropa(12, "Botas", 110000.00, "Timberland"));
        carrito.mostrarProductos();

        System.out.printf("Total: " + carrito.totalCompra());
    }
}
