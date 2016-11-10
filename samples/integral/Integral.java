import graph2D.*;
import java.awt.Color;
/**
 * Integral definida de una función. Represetación gráfica
 * 
 * @author IIP 16-17 (@mrebollo) 
 * @version 2.0
 * @since 20161102
 */
public class Integral
{
    /** función que se desea evaluar */
    private Funcion f;
    /** intervalo en el que se define la integral */
    private Intervalo interv;
    /** gráfico para representar la función */
    Graph2D grafico;

    /**
     * Constructor general: define una integral en el intervalo que se pasa
     * como parámetro. La función se define en el cófigo fuente directamente, 
     * modificando el fichero Funcion.java
     * @param   a   límite inferior del intervalo
     * @param   b   límite superior del intervalo
     */
    public Integral(double a, double b) {
        f = new Funcion();
        interv = new Intervalo(a, b);
    }

    /**
     * Constructor por defecto: define la integral en el intervalo [0,1]
     */
    public Integral() {
        this(0, 1);
    }

    /**
     * Resuelve la integral por el método de los rectángulos
     * @param   pasos   número de intervalos para aproximar la integral 
     * @return  valor de la integral de f(x) en [a,b]
     */
    public double resolver(int pasos) {
        double step = interv.size() / pasos;

        double areaRect = 0;
        Rectangulo rect = new Rectangulo();

        //System.out.printf( "\nx(k)\tx(k+1)\tf(x(k))\tInt R\tInt R (acum)\n" );
        //System.out.printf( "-----------------------------------------------\n" );
        for (double x = interv.getInf(); x <= interv.getSup(); 
            x += step) {
            double y = f.eval(x);
            rect.setRectangulo(step, y);
            areaRect += rect.area();
            if (grafico != null) {
                grafico.drawRect(x,y,step,y,Color.CYAN,2);
            }
            //System.out.printf( "%.5f\t%.5f\t%.5f\t%.5f\t%.5f\n", 
            //    x, x+step, f.eval(x), rect.area(), areaRect );
        } //for

        //System.out.println( "\nIntegral (mét rectángulos) " + areaRect);
        return areaRect;
    }
    
    /**
     * representa gráficamente la función en el intervalo
    */
    public void dibujar(){
        double xMin = interv.getInf();
        double xMax = interv.getSup();
        /* los valores mínimo y máximo de y dependerán de la función
         * y hay que estudiarlos
         */
        double yMin = -1.10;
        double yMax = +1.10;
        int windowMax =  600;
        
        grafico = new Graph2D(xMin, xMax , yMin, yMax, windowMax, windowMax);
                                    
        double delta = (xMax - xMin) / Graph2D.INI_WIDTH;   
        for (double x = xMin; x <= xMax; x = x + delta) {
            double y = f.eval(x);
            grafico.drawPoint(x, y, Color.BLUE, 2);
        }
    }
    
    /**
     * Método toString para obtener una representación de la integral
     * (no estaba en el enunciado, pero es más cómodo)
     * @return     String con la integral
     */
    public String toString()
    {
        return "int [" + interv.getInf() + "," 
                + interv.getSup() + "] " + f.toString() + " dx";
    }

}
