package co.edu.uniquindio.poo.model;
import java.util.LinkedList;
public class Empresa {
    private String nombre;
    private LinkedList<Persona>personas;
    private LinkedList<Vehiculo>vehiculos;
    

    public Empresa(String nombre, LinkedList<Persona> personas, LinkedList<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.personas = new LinkedList<>();
        this.vehiculos = new LinkedList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }
    public void eliminarPersona(Persona persona) {
        personas.remove(persona);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(LinkedList<Persona> personas) {
        this.personas = personas;
    }
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public static void main(String[] args) {
        
    }

}

