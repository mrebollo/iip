import java.util.Scanner;

/**
 * Cálculo de pi por el método de Montacarlo.
 * 
 * @author IIP 16-17 (@mrebollo)
 * @version 1.0
 * @since 20161028
 */

public class Montecarlo
{
    private static boolean pertenece (Punto p, Circulo c){
        return (p.distancia(c.getCentro()) <= c.getRadio());
        
        //return (c.getCentro().distancia(p) <= c.getRadio());
    }
    
    public static void main(){     
        Circulo circuloUnidad = new Circulo();
        
        Scanner input = new Scanner(System.in);
        System.out.println( "¿Cúntos puntos quieres usar?" );
        int numPuntos = input.nextInt();
        
        int dentro = 0;
        for (int i = 0; i < numPuntos; i++){
            Punto elPunto = new Punto();
            
            if ( pertenece(elPunto, circuloUnidad))
                dentro++;     
                
        } //for
        
        double pi = (double)dentro / numPuntos * 4;
        //Muestra pi redondeado a 4 decimales
        System.out.println( "El valor aproximado de pi = " 
                            + Math.round(pi * 1000) / 1000);
    }
    
}
