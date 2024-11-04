package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    private String numeroplaca;
    private String marca;
    private String modelo;
    private String local;
    private double tarifaInicial;

    public Vehiculo (String numeroplaca,String marca, String modelo, String local,double tarifaInicial){
        this.numeroplaca = numeroplaca;
        this.marca = marca;
        this.modelo= modelo;
        this.local = local;
        this.tarifaInicial=tarifaInicial;
    }

    public abstract double calcularReserva();

    public String getNumeroplaca() {
        return numeroplaca;
    }

    public void setNumeroplaca(String numeroplaca) {
        this.numeroplaca = numeroplaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTarifaInicial() {
        return tarifaInicial;
    }

    public void setTarifaInicial(double tarifaInicial) {
        this.tarifaInicial = tarifaInicial;
    }
    
}
