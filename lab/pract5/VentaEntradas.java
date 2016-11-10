import java.util.Locale;
import java.util.Scanner;
/** Clase VentaEntradas.
 *  Practica 5 - IIP - ETSINF-UPV.
 *  
 *  @author
 *  @version Curso 2016/17
 */
public class VentaEntradas {

    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        // Lectura de los datos de la entrada
        System.out.println("Caracteristicas de la entrada: ");
        System.out.print("   Titulo: ");
        String titulo = teclado.nextLine();
        /* A COMPLETAR: Lectura del RESTO de datos de la Entrada */
        
        
        // Creacion de la Entrada
        Entrada e = /* A COMPLETAR */  
    
        // Lectura de los datos para aplicar descuentos
        // variables a utilizar inicializadas por defecto a false:
        boolean diaEspec = false, festivo = false, 
                vispera = false, tCliente = false;
                
        System.out.print("Edad? ");
        int edad = teclado.nextInt(); teclado.nextLine();
        
        System.out.print("Es el dia del espectador? (SI/NO) "); 
        String res = teclado.next().toUpperCase(); 
        if (res.equals("SI")) { diaEspec = true; }
        
        /* A COMPLETAR: Lectura de RESTO de datos para aplicar DESCUENTOS */
        

        // Calculo del precio final de la Entrada e, 
        // invocando al metodo precioFinal
        double pFin = /* A COMPLETAR */ 
                      
    
        // Mostrar por pantalla el precio final
        System.out.println("El precio final para la entrada es: " 
            + String.format("%.2f", pFin) + " euros");
    }
}