package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private LinkedList<Vehiculo>vehiculos;

    public Persona(String nombre, String cedula, int edad, LinkedList<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.vehiculos=new LinkedList<>();
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
}
