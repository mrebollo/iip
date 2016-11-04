
/**
 * Circulo en un espacio bidimensional.
 * 
 * @author IIP 16-17 (@mrebollo)
 * @version 1.0
 * @since 20161028
 */
public class Circulo
{
   private Punto centro;
   private double radio;
   
   public Circulo (Punto c, double r){
       centro = c;
       radio = r;
   }
    
   public Circulo () {
       
       this(new Punto(0,0), 1);
   }
    
   public void setCentro (Punto c){
       centro = c;
   }
   
   public void setRadio (double r){
       radio = r;
   }
   
   public Punto getCentro(){ return centro; }
   public double getRadio(){ return radio; }
   
   public double perimetro (){
       return 2 * radio * Math.PI;
   }
   
   public double area (){
       return Math.PI * radio * radio;
   }
   
   public boolean equals (Object o){
       return o instanceof Circulo && radio == ((Circulo)o).radio;
   }
   
   public String toString(){
       return "centro " + centro.toString() + ", r = " + radio;
    }
}
