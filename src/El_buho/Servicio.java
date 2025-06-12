package El_buho;

public class Servicio {
    private String asiento;
    private double precio;
    private int numMaletas;

    public Servicio(String asiento, double precio, int numMaletas) {
        this.asiento = asiento;
        this.precio = precio;
        this.numMaletas =numMaletas;
    }

    public double costoAdicional(int numMaletas){
        return precio;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumMaletas() {
        return numMaletas;
    }

    public void setNumMaletas(int numMaletas) {
        this.numMaletas = numMaletas;
    }
}
