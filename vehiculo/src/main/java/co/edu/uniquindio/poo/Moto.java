package co.edu.uniquindio.poo;

import java.util.Date;

public class Moto extends Vehiculo {
    private TipoMoto tipoMoto;
    private int tarifaBase;
    public int tarifaTotal = 0;

    public Moto(String matricula, String marca,Date anioFabricacion, String modelo, TipoMoto tipoMoto, int tarifaBase) {
        super(matricula, marca, anioFabricacion, modelo);
        this.tipoMoto = tipoMoto;
        this.tarifaBase=tarifaBase;
    }

    @Override
    public double calcularReserva() {
        int tarifaAdiciona = 2000;
        if (tipoMoto == TipoMoto.AUTOMATICA){
           tarifaTotal= tarifaBase * tarifaAdiciona;

        } else{
            tarifaTotal = tarifaBase;
        }
        return tarifaTotal;
    }

    public TipoMoto getTipo() {
        return tipoMoto;
    }

    public void setTipo(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public int getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(int tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public String toString() {
        return "Moto [tipo=" + tipoMoto + ", tarifaBase=" + tarifaBase + "]";
    }


    
}
