package El_buho;

//La clase Vip es una subclase de Servicio
public class Vip extends Servicio {
    //Atributos
    private boolean tv;
    private boolean internet;
    private boolean comida;
    private boolean alcohol;

    //Constructor
    public Vip(String asiento, double precio, int numMaletas, boolean tv, boolean internet, boolean comida, boolean alcohol) {
        //Se aplica un recargo del 30% sobre el precio base
        super(asiento, precio * 1.3, numMaletas);
        this.tv = tv;
        this.internet = internet;
        this.comida = comida;
        this.alcohol = alcohol;
    }

    //Metodo sobrescrito
    @Override
    public double costoAdicional(int numMaletas) {
        if (numMaletas > 2) {
            return getPrecio()+(numMaletas-2)*15.0;
        }
        else {
            return getPrecio();
        }
    }

    //Metodo que imprime la informacion del servicio VIP
    public void mostrarInfoVip(){
        System.out.println("Tipo: Vip\n"+
                "Asiento: "+getAsiento()+
                "\nMaletas: "+getNumMaletas()+"\nTv: "+tv+"\nInternet: "+internet+"\nComida: "+comida+"\nAlcohol: "+ alcohol);
        System.out.println("Precio a pagar: "+costoAdicional(getNumMaletas()));
    }

}
