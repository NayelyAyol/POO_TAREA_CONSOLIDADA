package El_buho;

//Clase abstracta
public abstract class Servicio {
    //Atributos
    private String asiento;
    private double precio;
    private int numMaletas;

    //Constructor
    public Servicio(String asiento, double precio, int numMaletas) {
        this.asiento = asiento;
        this.precio = precio;
        this.numMaletas =numMaletas;
    }

    //Metodo abstracto
    public abstract double costoAdicional(int numMaletas);

    //Getters y setters para atributos privados
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
