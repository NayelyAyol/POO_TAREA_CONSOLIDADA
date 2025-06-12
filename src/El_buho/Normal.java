package El_buho;

public class Normal extends Servicio{

    public Normal(String asiento, double precio, String tipo, int numMaletas) {
        super(asiento, precio, tipo, numMaletas);
    }

    @Override
    public double costoAdicional(int numMaletas){
        if (numMaletas > 1){
            return getPrecio()*numMaletas;
        }
        else{
            return getPrecio();
        }
    }
}
