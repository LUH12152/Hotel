package hotel;

public class Hotel {
public String nombre;
public int estrellas;
private Habitacion[] habitacion;
private Reserva[] reserva;

    public Hotel(String nombre, int estrellas) {
        this.nombre = nombre;
        this.estrellas = estrellas;
    }

    public Hotel() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    public void registrarReserva(){

    }
    public void obtenerHabitacionesDisponibles(){

    }


    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", estrellas=" + estrellas +
                '}';
    }
}
