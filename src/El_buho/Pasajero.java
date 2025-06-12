package El_buho;

public class Pasajero {
    public String nombre;
    public String cedula;

    public Pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void infoPasajero(){
        System.out.println("Nombre: "+nombre+"\nCedula: "+cedula);
    }
}
