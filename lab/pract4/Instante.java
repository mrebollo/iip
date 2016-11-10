 

/**
 * <p>
 * Esta clase permite representar instantes o marcas de tiempo
 * (<code>Timestamp</code>) con detalle de minutos. Así, esta 
 * clase representa el momento o instante que define una hora,
 * en este caso, las horas y los minutos de la misma.
 * </p>
 * 
 *  @author IIP 
 *  @version Curso 2016-17
 */
public class Instante {

    // ATRIBUTOS:
    /** Variable entera para almacenar el atributo horas. 
     *  Debe pertenecer al rango <code>[0,23]</code>. */
    
    /** Variable entera para almacenar el atributo minutos. 
     *  Debe pertenecer al rango <code>[0,59]</code>. */
    

    // CONSTRUCTORES:
    /**
     *  Crea un <code>Instante</code> con el valor de
     *  las horas y los minutos que recibe como argumentos,
     *  <code>h</code> y <code>m</code> respectivamente.
     *
     *  <p> Debe cumplirse la precondición: 
     *  <code>0 <= h < 24, 0 <= m < 60</code>. </p>
     */
    
   
    /**
     * Crea un <code>Instante</code> con el valor del instante
     * actual UTC (tiempo universal coordinado).
     */
    
    
    // CONSULTORES Y MODIFICADORES:
    /** Devuelve las <code>horas</code> del Instante. */
    

    /** Devuelve los <code>minutos</code> del Instante. */
    
   
    /** Actualiza las <code>horas</code> del Instante. */ 
    
   
    /** Actualiza los <code>minutos</code> del Instante. */ 
    
   
    // OTROS MÉTODOS:
    /** Devuelve el Instante en el formato "<code>hh:mm</code>". */
    
   
    /** Devuelve <code>true</code> sii <code>o</code> es 
     *  un objeto de la clase <code>Instante</code>
     *  y sus <code>horas</code> y <code>minutos</code>
     *  coinciden con los del objeto en curso. 
     */
      
      
    /** Devuelve el número de minutos transcurridos desde las 00:00 
     *  hasta el instante representado por el objeto en curso.
     */
    
    
    /** Compara cronologicamente el instante del objeto en curso
     *  con el del objeto de la clase <code>Instante</code> referenciado
     *  por <code>otro</code>.
     *
     *  <p>
     *  El resultado es un valor:
     *  <ul>
     *     <li> negativo si el instante del objeto en curso 
     *     es anterior al de <code>otro</code>, </li>
     *     <li> cero si son iguales, </li>
     *     <li> positivo si el Instante del objeto en curso 
     *     es posterior al de <code>otro</code>. </li>
     *  </ul>
     *  </p>
     */
    

    // ACTIVIDAD EXTRA:
    /** Devuelve un <code>Instante</code> a partir de la descripción 
     *  textual (<code>String</code>) en formato "<code>hh:mm</code>".
     */
    
}
