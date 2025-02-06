package hotel;

public abstract class Cliente {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected int descuentoAnadido;

    Reserva nueva [] = new Reserva[1000];

    public Cliente(String nombre, String direccion, String telefono, int descuentoAnadido) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descuentoAnadido = descuentoAnadido;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getDescuentoAnadido() {
        return descuentoAnadido;
    }

    public void setDescuentoAnadido(int descuentoAnadido) {
        this.descuentoAnadido = descuentoAnadido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", descuentoAnadido=" + descuentoAnadido +
                '}';
    }

    public String obtenerDatos (){

        return "Obtener Datos Cliente ";
    }

    public void realizarReservar(){

    }

    public void realizarDescuento (){

    }

}
