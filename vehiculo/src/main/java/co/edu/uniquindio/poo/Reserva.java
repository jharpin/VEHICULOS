package co.edu.uniquindio.poo;

public class Reserva {
    public Cliente cliente;
    public Vehiculo vehiculo;
    public int diasReserva;
    
    
    
    Reserva( Cliente cliente, Vehiculo vehiculo, int diasReserva){

        this.cliente=cliente;
        this.vehiculo=vehiculo;
        this.diasReserva=diasReserva;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }

   

    @Override
    public String toString() {
        return "Reserva [cliente=" + cliente + ", vehiculo=" + vehiculo + ", diasReserva=" + diasReserva
                + ", tarifaBase=" +  "]";
    }

    
}
