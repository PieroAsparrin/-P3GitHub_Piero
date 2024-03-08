import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList <String> nombres = new ArrayList<>();
    public static void main(String[] args) {
    
        System.out.println("Este programa guarda nombres:");

        System.out.println("Escribe tu nombre:");
        String nombre = entrada.nextLine();
        nombres.add(nombre);
        System.out.println("El nombre " + nombre + " se ha guardado correctamente.");

        
    }
}