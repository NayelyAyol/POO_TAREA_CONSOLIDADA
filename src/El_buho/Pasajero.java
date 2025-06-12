package El_buho;

public class Pasajero {
    //Atributos
    private String nombre;
    private String cedula;

    //Constructor
    public Pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    //Metodo para mostrar la informacion del pasajero
    public void infoPasajero(){
        System.out.println("Nombre: "+nombre+"\nCedula: "+cedula);
    }

    //Getters y setters para los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
