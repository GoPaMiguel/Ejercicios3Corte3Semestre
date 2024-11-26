package Taller15Poo.Ejercicio2;

public class CalculadoraPrecio {
    
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }
}
