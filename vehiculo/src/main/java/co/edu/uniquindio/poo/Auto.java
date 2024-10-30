package co.edu.uniquindio.poo;

import java.util.Date;

public class Auto extends Vehiculo {
    public Reserva reserva;
    private int numeroPuertas;
    private int tarifaBase;
    private int tarifaTotal = 0;


    public Auto(String matricula, String marca, Date anioFabricacion, String modelo, int numeroPuertas, int tarifaBase, Reserva  reserva) {
        super(matricula, marca, anioFabricacion, modelo);
        this.reserva=reserva;
        this.numeroPuertas = numeroPuertas;
        this.tarifaBase=tarifaBase;
    }

    @Override
    public double calcularReserva() {
        int tarifaTotal = 0;

        tarifaTotal = tarifaBase * reserva.getDiasReserva();
        return tarifaTotal;



    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(int tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public int getTarifaTotal() {
        return tarifaTotal;
    }

    public void setTarifaTotal(int tarifaTotal) {
        this.tarifaTotal = tarifaTotal;
    }
    
    



}