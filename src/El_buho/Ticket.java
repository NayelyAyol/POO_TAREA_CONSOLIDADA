package El_buho;

public class Ticket {
    // Atributos
    private Ruta ruta;
    private Servicio servicio;
    private Pasajero pasajero;

    //Constructor de la clase Ticket
    public Ticket(Ruta ruta, Servicio servicio, Pasajero pasajero) {
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
    }

    // Metodo que calcula el costo total del ticket
    // Suma el precio base de la ruta con el costo adicional según el tipo de servicio y número de maletas
    public double costoTotal(){
        return ruta.getPrecio()+servicio.costoAdicional(servicio.getNumMaletas());
    }

    //Metodo para mostrar la informacion del ticket
    public void mostrarInfoTicket(){
        System.out.println("\n----------TICKET----------");
        System.out.println("PASAJERO");
        pasajero.infoPasajero();
        System.out.println("--------------------------");
        System.out.println("RUTA");
        ruta.infoRuta();
        System.out.println("--------------------------");
        System.out.println("SERVICIO");
        if (servicio instanceof Normal){
            ((Normal) servicio).infoServNormal();
        }
        else if (servicio instanceof Vip){
            ((Vip) servicio).mostrarInfoVip();
        }
        System.out.println("--------------------------");
        System.out.println("Total a pagar: "+costoTotal());
    }
}
