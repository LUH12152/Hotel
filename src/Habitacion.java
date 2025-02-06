package hotel;

public class Habitacion {
    protected float precio;
    protected int numero;
    protected String foto;



    public Habitacion(float precio, int numero, String foto) {
        this.precio = precio;
        this.numero = numero;
        this.foto = foto;


        Reserva nueva [] = new Reserva[1000];
        nueva [0] = new Reserva();


    }

    public Habitacion() {
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void obtenerDetalles(){

}

public void calcularPrecio() {

}

    @Override
    public String toString() {
        return "Habitacion{" +
                "precio=" + precio +
                ", numero=" + numero +
                ", foto='" + foto + '\'' +
                '}';
    }
}
