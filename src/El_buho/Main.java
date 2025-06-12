package El_buho;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Se crea una lista para almacenar las rutas
        List<Ruta> rutas = new ArrayList<>();
        rutas.add(new Ruta("Quito", "Guayaquil", 20.0));
        rutas.add(new Ruta("Quito", "Tulcán", 17.5));
        rutas.add(new Ruta("Quito", "Puyo", 15.0));
        rutas.add(new Ruta("Quito", "Riobamba", 17.5));

        //Se obtiene cada ruta de forma individual para usarlas
        Ruta r1= rutas.get(0);
        Ruta r2= rutas.get(1);
        Ruta r3= rutas.get(2);
        Ruta r4= rutas.get(3);

        //Objetos con valores nulos
        Normal n1 = new Normal(null, 0,0);
        //Se setean los valores nulos y se les asigna un nuevo valor
        n1.setAsiento("Pasillo");
        n1.setPrecio(7.50);
        n1.setNumMaletas(2);

        Pasajero p1 = new Pasajero("Ana Torres", null);
        p1.setCedula("1735261728");

        Ticket t1 = new Ticket(r1, n1, p1);
        t1.mostrarInfoTicket(); //Usar el metodo para mostrar la informacion del ticket

        Vip v1 = new Vip("Ventana", 0, 4, true, false, true, true);
        v1.setPrecio(12.50);

        Pasajero p2 = new Pasajero(null, null);
        p2.setNombre("Liam Vega");
        p2.setCedula("1928736521");

        Ticket t2=new Ticket(r2, v1,p2);
        t2.mostrarInfoTicket(); //Usar el metodo para mostrar la informacion del ticket

        Normal n2 = new Normal(null, 0,0);
        n2.setAsiento("Pasillo");
        n2.setPrecio(7.50);
        n2.setNumMaletas(5);

        //Objetos con valores quemados
        Pasajero p3 = new Pasajero("Joel Jacome", "1029387625");
        Ticket t3 = new Ticket(r3, n2, p3);
        t3.mostrarInfoTicket(); //Usar el metodo para mostrar la informacion del ticket

        Vip v2=new Vip("Ventana", 12.50, 3, false, false, false, false);
        Pasajero p4=new Pasajero("Lesly Vargas", "1826473625");
        Ticket t4 = new Ticket(r4, v2, p4);
        t4.mostrarInfoTicket(); //Usar el metodo para mostrar la informacion del ticket

        Normal n3 = new Normal("Pasillo", 7.50,3);
        Pasajero p5=new Pasajero("Lesly Vargas", "1826473625");
        Ticket t5 = new Ticket(r2, n3, p5);
        t5.mostrarInfoTicket(); //Usar el metodo para mostrar la informacion del ticket

    }
}