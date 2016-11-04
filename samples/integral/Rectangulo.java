/**
 * Implemetación de una clase rectángulo para integración.
 * 
 * @author IIP 16-17 
 * @version 2.0
 * @since 20161031
 */
public class Rectangulo
{
    /** lado del rectángulo */
    private double lado1;
    /** lado del rectángulo */
    private double lado2;
    
    /**
     * Constructor general: crea un rectángulo a partir de la longitud
     * de us dos lados
     * @param   l1   uno de los lados del rectángulo
     * @param   l2   otro de los lados del rectángulo
     */
    public Rectangulo(double l1, double l2) {
        lado1 = l1;
        lado2 = l2;
    }
    
    /**
     * Constructor por defecto: crea un rectángulo de lado l1 = l2 = 1
     */
    public Rectangulo() {
        this(1, 1);
    }
    
    /**
     * Método modificador: varía las dimensiones del rectángulo
     * @param   l1   uno de los lados del rectángulo
     * @param   l2   otro de los lados del rectángulo
     */
    public void setRectangulo(double l1, double l2) {
        lado1 = l1;
        lado2 = l2;
    }
    
    /**
     * Calcula el área del rectángulo
     * @return  producto de los dos lados l1 * l2
     */
    public double area() {
        return lado1 * lado2;
    }
}
