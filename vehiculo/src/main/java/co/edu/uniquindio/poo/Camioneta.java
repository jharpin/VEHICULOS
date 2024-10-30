package co.edu.uniquindio.poo;

import java.util.Date;

public class Camioneta extends Vehiculo {
    private double capacidadCarga;
    public int tarifaBase;
    public double tarifaTotal = 0;


    public Camioneta(String matricula, String marca, Date anioFabricacion, String modelo, double capacidadCarga,int tarifaBase) {
        super(matricula, marca, anioFabricacion, modelo);
        this.capacidadCarga = capacidadCarga;
        this.tarifaBase=tarifaBase;
    }

    @Override
    public double calcularReserva() {
        tarifaBase=20000;
        tarifaTotal = 0;
        tarifaTotal= tarifaBase * capacidadCarga;
        return tarifaBase;
        
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}