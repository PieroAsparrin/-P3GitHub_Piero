import java.util.Scanner;

public class NuevaFuncionalidad {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--- SUMA ---");
        
        System.out.println("Escribe un número:");
        int numero1 = entrada.nextInt();

        System.out.println("Escribe otro número:");
        int numero2 = entrada.nextInt();

        System.out.println(numero1 + " + " + numero2 + " = "+ suma(numero1, numero2));;
    }
    private static int suma(int numero1, int  numero2) {
        int suma;
        suma = numero1 + numero2;
        return suma;    
    }


}
