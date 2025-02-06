package hotel;

public class ClienteExporadico extends Cliente{
    public ClienteExporadico(String nombre, String direccion, String telefono, int descuentoAnadido) {
        super(nombre, direccion, telefono, descuentoAnadido);
    }

    public ClienteExporadico() {
    }

    public void suscribirOfertas(){

    }


    @Override
    public String toString() {
        return "ClienteExporadico{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", descuentoAnadido=" + descuentoAnadido +
                '}';
    }
}
