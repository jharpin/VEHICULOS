package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo {
    private int numeropuertas;
    private int dias;
    public Auto(String numeroplaca,String marca, String modelo, String local,int numeropuertas,double tarifaInicial,int dias){
        super(numeroplaca, marca, modelo, local, tarifaInicial);
        this.numeropuertas=numeropuertas;
        this.dias=dias;

    }

    @Override
    public double calcularReserva(){
        return getTarifaInicial()*getDias();
     }
    public int getNumeropuertas(){
        return numeropuertas;
    }
    public void setNumeropuertas(int numeropuertas){
        this.numeropuertas=numeropuertas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
}
