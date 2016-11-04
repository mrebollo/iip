
/**
 * Intervalo entre dos puntos.
 * 
 * @author IIP 16-17 (@mrebollo)
 * @version 1.0
 * @since 20161102
 */
public class Intervalo
{
    /** límite inferior del intervalo */
    private double inf;
    /** límite superior del intervalo */
    private double sup;

    /**
     * Constructor general: crea un intervalo a partir de sus dos extremos
     * que se pasan como parámetros
     * @param   a   límite inferior del intervalo
     * @param   b   límite superior del intervalo
     */
    public Intervalo(double a, double b) {
        inf = a;
        sup = b;
    }

    /**
     * Constructor por defecto: crea el intervalo [0,1]
     */
    public Intervalo() {
        this(0, 1);
    }

    /**
     * Método consultor: obtiene el límite inferior del intervalo
     * @return límite inferior
     */
    public double getInf() { return inf; }

    /**
     * Método consultor: obtiene el límite superior del intervalo
     * @return límite superior
     */
    public double getSup() { return sup; }

    /**
     * Obtiene el tamaño del intervalo
     * @return diferencia límite sup - límte inf
     */
    public double size() {
        return sup - inf;
    }
}
