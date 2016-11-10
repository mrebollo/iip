/**
 * Cálculo del valor de una integral.
 * 
 * @author IIP 16-17 
 * @version 1.0
 * @since 20161031
 */

import java.util.Scanner;

public class CalcIntegral {
    /**
     * Programa principal. Socilita al usuario los límites de la integral 
     * y el número de intervalos que se van a usar para aproximar la función. 
     * El programa calcula el valor de la integal y muestra el resultado.
     */
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print( "límite inferior: " );
        double a = input.nextFloat();
        System.out.print( "límite superior: " );
        double b = input.nextFloat();
        System.out.print( "número de intervalos: " );
        int numInterval = input.nextInt();

        Integral laIntegral = new Integral(a, b);
        laIntegral.dibujar();
        double valorInt = laIntegral.resolver(numInterval);
        System.out.println( laIntegral.toString() + " = " + valorInt );
    }//main()
    
} //Integral
