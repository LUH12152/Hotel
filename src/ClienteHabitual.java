package hotel;

public class ClienteHabitual extends Cliente{

    public ClienteHabitual(String nombre, String direccion, String telefono, int descuentoAnadido) {
        super(nombre, direccion, telefono, descuentoAnadido);
    }

    public ClienteHabitual() {
    }


    public void calcularDescuento (){

    }


    @Override
    public String toString() {
        return "ClienteHabitual{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", descuentoAnadido=" + descuentoAnadido +
                '}';
    }
}
