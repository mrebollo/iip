import graph2D.*;
import java.awt.Color;
import javax.swing.JOptionPane; //para los diálogos
import java.util.Scanner;

/**
 * Cálculo de pi por el método de Montacarlo.
 * 
 * @author IIP 16-17 (@mrebollo)
 * @version 2.0
 * @since 20161028
 */

public class MontecarloGr
{
    private static boolean pertenece (Punto p, Circulo c){
        return (p.distancia(c.getCentro()) <= c.getRadio());

        //return (c.getCentro().distancia(p) <= c.getRadio());
    }

    public static void main(){     
        int CANVAS_SIZE = 600; 
        int CIRCLE_SIZE = CANVAS_SIZE - 5;
        Graph2D grafico = new Graph2D(-1,1,-1,1,CANVAS_SIZE,CANVAS_SIZE);

        Circulo circuloUnidad = new Circulo();
        grafico.drawOval(-1,1,2,2,Color.black,2);
        //muestra un diálogo para que el usuario teclee el número de puntos
        String respuesta = JOptionPane.showInputDialog("¿Cuántos puntos quieres usar?");
        int numPuntos = Integer.parseInt(respuesta);

        int dentro = 0;
        for (int i = 0; i < numPuntos; i++){
            Punto elPunto = new Punto(-1,1,-1,1);
            double x = elPunto.getX();
            double y = elPunto.getY();
            if ( pertenece(elPunto, circuloUnidad)) {
                dentro++;     
                grafico.drawPoint(x, y, Color.blue, 1);
            } else {
                grafico.drawPoint(x, y, Color.red, 1);
            }
        } //for

        double pi = (double)dentro / numPuntos * 4;
        //muestra un diálogo con el resultado
        JOptionPane.showMessageDialog(null,"Valor paroximado de pi = " + pi);
    }

}



