/**
 * La clase IIPMath implementa algunas operaciones matematicas:
 * IIPMath.sqrt(double) e IIPMath.log(double).
 *
 * @author (IIP-PRG-DSIC-ETSINF. pmarques)
 * @version (curs 2016-17)
 */
public class IIPMath {
    
    public final static double LOG_2 = 0.6931471805599453;
    
    /** No se pueden crear objetos de este tipo. */
    private IIPMath() { }    
    
    /**
     * Devuelve la raiz cuadrada de x >= 0, con error epsilon > 0. 
     * @param x. El valor. x >= 0.
     * @param epsilon. El error. Epsilon > 0.
     * @return double. La raiz de x con error maximo 
     * epsilon. "Calculo Numerico Fundamental". DEMIDOVICH
     */
    public static double sqrt(double x, double epsilon) {
        if (x == 0) { return 0; }   
        // No es necesaria la condicion anterior, pero queda mas 
        // presentable el resultado para 0
        double term = (1 + x) / 2;
        double error = epsilon + 1;
        while (error >= epsilon) {
            error = term;
            term = (term + x / term) / 2;
            error = error - term;        
        }        
        return term;
    }            

    /**
     * Devuelve la raiz cuadrada de x >= 0 con error 1e-15. 
     * @param x. El valor.
     * @return double. La raiz de x con error maximo 1e-15.
     */
    public static double sqrt(double x) {    
        return sqrt(x, 1e-15);
    }  
                    
    /* ******************************************************** */
    /* ******************************************************** */
    /* ******************************************************** */
                
    /**
     * Devuelve log(z), 1/2 <= z < 1, con error
     * epsilon > 0. Demidovich. Calculo Numerico Fundamental.
     * @param z. Valor del que se calcula el log. 1/2 <= z < 1.
     * @param epsilon. El error maximo, valor positivo.
     * @return double. Valor log(z) con error maximo epsilon.
     */
    public static double logBase(double z, double epsilon) {

        // Iteracion calculo de log x:
        double y = (1 - z) / (1 + z);
        double y2 = y * y;

        int k = 1;        
        double u = y;       // termino k-esimo
        double sum = u;     // suma hasta el término k-esimo
                
        while (u >= epsilon) {
            // calculo y acumulacion de cada termino                      
            u = u * y2 * (2 * k - 1) / (2 * k + 1);
            k++;
            sum += u;
        }
        
        return -2 * sum;
    }
            
    /**
     * Devuelve log(x), x > 0, con error epsilon > 0.
     * Demidovich. Calculo Numerico Fundamental. Pag 105-108.
     * @param x. Valor del que se calcula el logaritmo, 0 < x.
     * @param epsilon. El error maximo, mayor que 0.
     * @return double. Valor log(x) con error maximo 
     * epsilon.
     */
    
    public static double log(double x, double epsilon) {
        
        if (x == 1) { return 0; }   
        
        int m = 0;
        double z = x;
        
        if (z >= 1) {
            // Cálculo de m y z, con x = 2^m*z y 1/2 <= z < 1
            while (z >= 1) { z = z / 2; m++; }        
            // Calculo de log x
            return m * LOG_2 + logBase(z, epsilon);  
        } else 
            if (z < 0.5) {
                // Cálculo de m y z, con x*2^m = z y 1/2 <= z < 1
                while (z < 0.5) { z = z * 2; m++; }            
                // Calculo de log x
                return -m * LOG_2 + logBase(z, epsilon);   
            }
            else { return logBase(z, epsilon); }
    }
    
    

    /**
     * Devuelve log(x), x > 0, con error 1e-15.
     * @param x. Valor del que se calcula el log. x > 0.
     * @return double. Valor log(x).
     */
    public static double log(double x) {    
        return log(x, 1e-15);
    }
                        
    /* ******************************************************** */
    /* ******************************************************** */
    /* ******************************************************** */

//     Version 2.  Mes succinta que l'anterior.  
//     public static double log(double x, double epsilon) {
// 
//         if (x == 1) { return 0; }        
//         
//         // Cálculo m y z tales que x = 2^m*z y 1/2 <= z < 1
//         int m = 0;
//         double z = x;
//                     
//         while (z >= 1) { z = z / 2; m++; }
//         
//         while (z < 0.5) { z = z * 2; m--; }
//          
//         // Calculo de log x
//         return m * LOG_2 + logBase(z, epsilon);                  
//     }
//        
    
//     Version 3. Per a x < 0.5 es crida a ella mateixa.
//     public static double log(double x, double epsilon) {
//     
//         if (x == 1) { return 0; }    
// 
//         if (x < 0.5) { return -log(1 / x, epsilon); }
// 
//         // Cálculo m y z tales que x = 2^m*z y 1/2 <= z < 1
//         int m = 0;
//         double z = x;
//             
//         while (z >= 1) { z /= 2; m++; }
//           
//         // Cálculo de log x
//         return m * LOG_2 + logBase(z, epsilon);                  
//     }    
    
    
//    Version 4. Per a x < 0.5 Com l'anterior sense cridar-se
//     public static double log(double x, double epsilon) {
//     
//         if (x == 1) { return 0; }    
//         
//         boolean menor05 = false;
//         if (x < 0.5) { x = 1 / x; menor05 = true; }
// 
//         // Cálculo m y z tales que x = 2^m*z y 1/2 <= z < 1
//         int m = 0; 
//         double z = x;
//             
//         while (z >= 1) { z = z / 2; m++; }
//           
//         // Cálculo de log x
//         double logX = m * LOG_2 + logBase(z, epsilon);
//         
//         if (menor05) return -logX; else return logX;
//     }        
        
}
