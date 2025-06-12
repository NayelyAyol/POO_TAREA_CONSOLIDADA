package El_buho;

public class Ruta {
    //Atributos
    public String origen;
    public String destino;
    private double precio;

    //Constructor
    public Ruta(String origen, String destino, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    //Metodo get y set para atributos privados
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo para mostrar la informacion de la ruta
    public void infoRuta(){
        System.out.println("Origen: "+origen+"\nDestino: "+destino+"\nPrecio Base: "+precio);
    }
}
