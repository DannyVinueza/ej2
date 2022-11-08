import java.text.DecimalFormat;
import java.util.Scanner;
public class hola {
    /*public static void main(String[] args) {
        Automovil a = new Automovil();
        System.out.println("Marca: " + a.marca);
        System.out.println("Año: " + a.anio);
        System.out.println("Color: " + a.Color);
        System.out.println("Modelo: " + a.Modelo);
    }*/
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Jugador j = new Jugador();
        System.out.println("Nombre: " + j.getNombre());
        System.out.println("Edad: " + j.getEdad());
        j.setEdad(25);
        System.out.println("Edad: " + j.getEdad());

        Jugador q = new Jugador();
        System.out.println("Nombre: " + q.getNombre());
        q.setNombre("Luis Vinueza");
        System.out.println("Nombre: " + q.getNombre());
        System.out.println("Edad: " + j.getEdad());
        q.setEdad(42);
        System.out.println("Edad: " + q.getEdad());
        Jugador z = new Jugador();
        System.out.println("Nombre: " + z.getNombre());
        q.setNombre("Luis Vinueza");
        System.out.println("Nombre: " + z.getNombre());
        System.out.println("Edad: " + z.getEdad());
        q.setEdad(42);
        System.out.println("Edad: " + z.getEdad());
    }
}