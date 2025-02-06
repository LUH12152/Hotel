package hotel;

import java.util.Date;
import java.util.*;

public class Reserva {
    private Date fechaEntrada;
    private int numeroDias;
    private Habitacion habitacion;
    private Cliente cliente;
    private Hotel hotel;

    public Reserva(Date fechaEntrada, int numeroDias, Habitacion habitacion, Cliente cliente, Hotel hotel) {
        this.fechaEntrada = fechaEntrada;
        this.numeroDias = numeroDias;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.hotel = hotel;
    }

    public Reserva() {
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fechaEntrada=" + fechaEntrada +
                ", numeroDias=" + numeroDias +
                ", habitacion=" + habitacion +
                ", cliente=" + cliente +
                ", hotel=" + hotel +
                '}';
    }

    public void calcularCostoTotal (){


    }

    public void asignarHabitacion(){

    }
    public void obtenerCliente(){

    }

}
