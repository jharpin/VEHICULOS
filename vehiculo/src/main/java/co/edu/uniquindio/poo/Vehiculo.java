package co.edu.uniquindio.poo;

import java.util.Date;

public abstract class Vehiculo {
    protected String matricula;
    protected String marca;
    protected Date anioFabricacion;
    protected String modelo;

    public Vehiculo(String matricula, String marca, Date anioFabricacion, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.modelo = modelo;
    }

    // Método abstracto
    public abstract double calcularReserva();

    // Métodos comunes
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}