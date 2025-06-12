package El_buho;

public class Ticket {
    private Ruta ruta;
    private Servicio servicio;
    private Pasajero pasajero;

    public Ticket(Ruta ruta, Servicio servicio, Pasajero pasajero) {
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
    }

    public double costoTotal(){
        return servicio.costoAdicional();
    }

    public void mostrarInfoTicket(){
        System.out.println("Datos del pasajero: ");
        pasajero.infoPasajero();
        System.out.println("Ruta:");
        ruta.infoRuta();
        System.out.println("Servicio:");
        servicio.
    }
}
