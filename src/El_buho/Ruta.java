package El_buho;

public class Ruta {
    public String origen;
    public String destino;
    private double precio;

    public Ruta(String origen, String destino, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void infoRuta(){
        System.out.println("Origen: "+origen+"\nDestino: "+destino+"\nPrecio: "+precio);
    }
}
