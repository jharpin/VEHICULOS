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
    public boolean agregarCliente(Persona persona) {
        boolean centinela = false;
        if (!verificarCliente(persona.getCedula())) {
            personas.add(persona);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Persona persona : personas) {
            if (persona.getCedula().equals(cedula)) {
                personas.remove(persona);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(String cedula, Persona actualizado) {
        boolean centinela = false;
        for (Persona persona : personas) {
            if (persona.getCedula().equals(cedula)) {
                persona.setCedula(actualizado.getCedula());
                persona.setNombre(actualizado.getNombre());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Persona persona : personas) {
            if (persona.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
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

}
