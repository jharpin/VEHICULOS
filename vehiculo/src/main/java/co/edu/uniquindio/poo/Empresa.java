package co.edu.uniquindio.poo;

import java.util.List;

public class Empresa {
    private String nombre;
    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
