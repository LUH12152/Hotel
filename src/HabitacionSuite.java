package hotel;

public class HabitacionSuite extends Habitacion{

    private boolean banera;
    private boolean sauna;
    private boolean mirador;

    public HabitacionSuite(float precio, int numero, String foto, boolean banera, boolean sauna, boolean mirador) {
        super(precio, numero, foto);
        this.banera = banera;
        this.sauna = sauna;
        this.mirador = mirador;
    }

    public HabitacionSuite(boolean banera, boolean sauna, boolean mirador) {
        this.banera = banera;
        this.sauna = sauna;
        this.mirador = mirador;
    }

    public boolean isBanera() {
        return banera;
    }

    public void setBanera(boolean banera) {
        this.banera = banera;
    }

    public boolean isSauna() {
        return sauna;
    }

    public void setSauna(boolean sauna) {
        this.sauna = sauna;
    }

    public boolean isMirador() {
        return mirador;
    }

    public void setMirador(boolean mirador) {
        this.mirador = mirador;
    }

    public void calcularPrecio(){

    }

    @Override
    public String toString() {
        return "HabitacionSuite{" +
                "banera=" + banera +
                ", sauna=" + sauna +
                ", mirador=" + mirador +
                ", precio=" + precio +
                ", numero=" + numero +
                ", foto='" + foto + '\'' +
                '}';
    }
}
