package hotel;

public class HabitacionDoble extends Habitacion {

    private boolean matrimonial;

    public HabitacionDoble(float precio, int numero, String foto, boolean matrimonial) {
        super(precio, numero, foto);
        this.matrimonial = matrimonial;
    }

    public HabitacionDoble(boolean matrimonial) {
        this.matrimonial = matrimonial;
    }

    public boolean isMatrimonial() {
        return matrimonial;
    }

    public void setMatrimonial(boolean matrimonial) {
        this.matrimonial = matrimonial;
    }

    public void calcularPrecio() {

    }

    @Override
    public String toString() {
        return "HabitacionDoble{" +
                "matrimonial=" + matrimonial +
                ", precio=" + precio +
                ", numero=" + numero +
                ", foto='" + foto + '\'' +
                '}';
    }
}
