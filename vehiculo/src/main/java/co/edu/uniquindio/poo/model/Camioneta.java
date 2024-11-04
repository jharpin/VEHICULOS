package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo{
    private double carga;
    private Camioneta(String numeroplaca,String marca, String modelo, String local,double carga, double tarifaInicial){
        super(numeroplaca, marca, modelo, local, tarifaInicial);
        this.carga=carga;
    }

    @Override
    public double calcularReserva(){
        double porcentajeExtraPorTonelada = 0.10; 
        
        double costoExtra = getTarifaInicial() * (porcentajeExtraPorTonelada * carga);
        
        return getTarifaInicial() + costoExtra;
    }

    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }
    
}
