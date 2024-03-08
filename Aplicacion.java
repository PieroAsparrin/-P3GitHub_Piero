import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<String> nombres = new ArrayList<>();

    public static void main(String[] args) {
        boolean salirBucle = false;

        
            System.out.println("Este programa guarda nombres:");

        do {
            System.out.println("Escribe un nombre:");
            String nombre;
            nombre = entrada.nextLine();
            nombres.add(nombre);
            System.out.println("El nombre " + nombre + " se ha guardado correctamente.");

            System.out.println("¿Desea guardar otro nombre?\n1.Si\n2.No");
            int eleccion = entrada.nextInt();
            if (eleccion == 1) {
                entrada.nextLine();
                System.out.println("");
            }else if (eleccion == 2) {
                salirBucle = true;
            }
        } while (!salirBucle);
    }
}