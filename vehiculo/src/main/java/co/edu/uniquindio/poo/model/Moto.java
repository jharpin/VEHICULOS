package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private Tipo_caja tipo_caja;

    public Moto(String numeroplaca,String marca, String modelo, String local,Tipo_caja tipo_caja, double tarifaInicial){
        super(numeroplaca, marca, modelo, local, tarifaInicial);
        this.tipo_caja=tipo_caja;
    }

    @Override 
    public double calcularReserva(){
        double tarifaAdicional=0;
        if(tipo_caja==Tipo_caja.AUTOMATICA){
           tarifaAdicional=500;
        }
        return getTarifaInicial()+tarifaAdicional;
       
    }

    public Tipo_caja getTipo_caja() {
        return tipo_caja;
    }

    public void setTipo_caja(Tipo_caja tipo_caja) {
        this.tipo_caja = tipo_caja;
    }
    
}
