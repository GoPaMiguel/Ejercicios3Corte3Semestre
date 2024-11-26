package Taller3Poo.Ejercicio2.Vehiculos;

class Vehiculo {

    String tipo;

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
