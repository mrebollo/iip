/**
 * Evaluación de una función.
 * 
 * Esta es una clase especial, que no tiene atributos ni constructores. 
 * El único método que se define es el método eval(), que permite evaluar
 * la función en un punto dado. 
 * 
 * Para usarla, hay que escribir dentro del método el código correspondiente
 * a la función que se desea evaluar. Puede hacerse definiendo una instancia
 * de la clase función, o directamente como Funcion.eval(x), sin crearç
 * una instancia previa
 * 
 * @author IIP 16-17 (@mrebollo) 
 * @version 1.0
 * @since 20161031
 */
public class Funcion {

    /**
     * Evalúa la función en un punto que se pasa como parámetro
     * @param   x   punto en el que se quere evaluar la función
     * @return  valor de la función en x f(x)
     */
    public static double eval(double x) {
        /* Escrine aquí la función que deseas integrar */
        return Math.sin(x);
    } //eval()  
    
     /**
     * Método toString para obtener una representación de la función
     * (no estaba en el enunciado, pero es más cómodo)
     * @return     String con la función
     */
    public String toString()
    {
        return "sin(x)";
    }
} //Funcion
