package hotel;

public class HabitacionSencilla extends Habitacion{

    private boolean sencillo;


    public void calcularPrecio(){

    }

    public HabitacionSencilla(float precio, int numero, String foto, boolean sencillo) {
        super(precio, numero, foto);
        this.sencillo = sencillo;
    }

    public HabitacionSencilla(boolean sencillo) {
        this.sencillo = sencillo;
    }

    public boolean isSencillo() {
        return sencillo;
    }

    public void setSencillo(boolean sencillo) {
        this.sencillo = sencillo;
    }

    @Override
    public String toString() {
        return "HabitacionSencilla{" +
                "sencillo=" + sencillo +
                ", precio=" + precio +
                ", numero=" + numero +
                ", foto='" + foto + '\'' +
                '}';
    }
}
