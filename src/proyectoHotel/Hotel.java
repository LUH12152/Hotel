package proyectoHotel;

public class Hotel {
    private String nombre;
    private int estrellas;

    public Hotel(String nombre, int estrellas) {
        this.nombre = nombre;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrelllas() {
        return estrellas;
    }

    public void setEstrelllas(int estrelllas) {
        this.estrellas = estrelllas;
    }

    public String obtenerInformacion (){

        return "Nombre Hotel " + this.nombre + " \n " +
        "Numero de estrellas " + this.estrellas;

    }

    public void registrarReserva (){
        System.out.println("Reservando Habitacion");

    }

    public void obetenerHabitacionesDisponibles (){
        System.out.println("Consultar habitaciones disponibles");

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", estrelllas=" + estrellas +
                '}';
    }
}
