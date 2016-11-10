
/**
 * Cálculo del valor de pi mediante una simulación Montecarlo.
 * Interfaz gráfico
 * 
 * @author  @mrebollo 
 * @version 2.0
 * @since   20161028
 */
import objectdraw.*;            //para la interfaz gráfica
import java.awt.*;              //para el atributo Color
import javax.swing.JOptionPane; //para los diálogos

public class MontecarloApplet extends WindowController
{
    private static final int CANVAS_SIZE = 600;
    private static final int CIRCLE_SIZE = CANVAS_SIZE;
   
    private static boolean pertenece (Punto p, Circulo c){
        return (p.distancia(c.getCentro()) < c.getRadio());
    }
    
    public void begin(){

        Circulo circuloUnidad = new Circulo(new Punto(CIRCLE_SIZE/2,CIRCLE_SIZE/2), CIRCLE_SIZE/2);
        //define el tamaño de la ventana
        setSize(CANVAS_SIZE,CANVAS_SIZE+50);
        //dibuja la circunferencia
        FramedOval circulo = new FramedOval(0, 0, CIRCLE_SIZE, CIRCLE_SIZE,canvas);
        
        //muestra un diálogo para que el usuario teclee el número de puntos
        String respuesta = JOptionPane.showInputDialog("¿Cuántos puntos quieres usar?");
        int numPuntos = Integer.parseInt(respuesta);
        int dentro = 0;
        
        for (int i = 0; i < numPuntos; i++){
            Punto elPunto = new Punto(CIRCLE_SIZE);
            //calcula la posición en la ventana del punto
            Location coor = new Location(elPunto.getX(),elPunto.getY());
            //crea un punto en esa posición (coor) de tamaño 2x2
            FilledOval coorPunto = new FilledOval(coor,2,2,canvas);
            
            if ( pertenece(elPunto, circuloUnidad)){
                dentro++;
                //pinta el punto de azul
                coorPunto.setColor(Color.blue);
            }else{
                //pinta el punto de rojo
                coorPunto.setColor(Color.red);
            }
            
        } //for
        double pi = (double)dentro / numPuntos * 4;
        //muestra un diálogo con el resultado
        JOptionPane.showMessageDialog(null,"Valor paroximado de pi = " + pi);
    }
    
    
}
