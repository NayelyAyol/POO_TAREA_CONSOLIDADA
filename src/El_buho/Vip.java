package El_buho;

public class Vip extends Servicio {
    private boolean tv;
    private boolean internet;
    private boolean comida;
    private boolean alcohol;

    public Vip(String asiento, double precio, String tipo, int numMaletas, boolean tv, boolean internet, boolean comida, boolean alcohol) {
        super(asiento, precio, tipo, numMaletas);
        this.tv = tv;
        this.internet = internet;
        this.comida = comida;
        this.alcohol = alcohol;
    }

    @Override
    public double costoAdicional(int numMaletas) {
        if (numMaletas > 2) {
            return getPrecio()*numMaletas;
        }
        else {
            return getPrecio();
        }
    }

    public void mostrarInfoVip(){
        System.out.println("----SERVICIOS----\n"+
                "Tipo: "+ getTipo()+"\nTv: "+tv+"\nInternet: "+internet+"\nComida: "+comida+"\nAlcohol: "+ alcohol);
        System.out.println("Precio a pagar: ");
    }

}
