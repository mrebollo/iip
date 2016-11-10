import java.util.Scanner;

/**
 *  Clase Practica3.
 *  Una primera clase con lectura de datos desde teclado, 
 *  y uso de operaciones con int, long, Math y String.
 *  Contiene tres errores de compilacion.
 *  @author IIP 
 *  @version Curso 2016-17
 */
public class Practica3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = teclado.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = teclado.nextInt();
        System.out.println("Hora introducida: " + h + " y " + m + ".");      
    }    
 
}