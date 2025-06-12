package El_buho;

//La clase Normal hereda de la clase abstracta Servicio
public class Normal extends Servicio{

    //Constructor
    public Normal(String asiento, double precio, int numMaletas) {
        super(asiento, precio, numMaletas);
    }

    //Metodo sobrescrito
    @Override
    public double costoAdicional(int numMaletas){
        if (numMaletas > 1){
            return getPrecio()+(numMaletas-1)*10.0;
        }
        else{
            return getPrecio();
        }
    }

    //Metodo que muestra la información del servicio Normal
    public void infoServNormal(){
        System.out.println("Tipo: Normal\nAsiento: "+ getAsiento()+
                "\nMaletas: "+getNumMaletas()+
                "\nCosto total: "+costoAdicional(getNumMaletas()));
    }
}
