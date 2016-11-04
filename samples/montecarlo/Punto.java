
/**
 * Punto en un espacio bidimensional.
 * 
 * @author IIP 16-17 (@mrebollo)
 * @version 2.0
 * @since 20161028
 */
public class Punto
{
   private double x;
   private double y;
   
   public Punto (double x, double y){
       this.x = x;
       this.y = y;
   }
    
   public Punto (){
       this(Math.random(), Math.random());
   }
    
   public Punto (double range){
       this(Math.random()*range, Math.random()*range);
    }
    
   public void setPunto (double x, double y){
       this.x = x;
       this.y = y;
   }
   
   public double getX(){ return x; }
   public double getY(){ return y; }
   
   public double distancia (Punto p){
       return Math.sqrt( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
   }
   
   public boolean equals (Object o){
       return o instanceof Punto && x == ((Punto)o).x && y == ((Punto)o).y;
   }
   
   public String toString(){
       return "(" + x + "," + y+ ")";
   }
}
