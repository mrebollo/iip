
/**
 * Manejo de bucles sobre cadenas de caracteres (String).
 * 
 * @author IIP 
 * @version nov 2015
 */
public class Palabras
{
    
     /**
     * Dada una palabra que se le pasa como parámetro, muestra por
     * pantalla cada letra en una línea distinta
     * 
     * @param  palabra   palabra a imprimir
     */
    public static void separarLinea( String palabra ){
        /*
         * COMPLETAR
         */
    }
    
     /**
     * Dada una palabra que se le pasa como parámetro, muestra por
     * pantalla la palabra separada por guiones. Por ejemplo, si la palabra
     * es "hola" muestra "h-o-l-a"
     * 
     * @param  palabra   palabra a imprimir
     */
    public static void separarGuion( String palabra ){
        /*
         * COMPLETAR
         */
    }
    
     /**
     * Dada una frase que se le pasa como parámetro, la devuelve codificada
     * desplazando cada letra un número detemrinado de caracteres n que se le
     * pasa como parámetro. Por ejemplo, codificar( "hola", 1 ) debería
     * devolver "ipmb"
     * 
     * @param  frase    frase a codificar
     * @param  n        número de posiciones a desplazar
     * @return          frase codificada según la regla
     */
    public static String codificar( String frase, int n ){
        /*
         * COMPLETAR
         */
        return ""; //para que compile, cámbialo como corresponda
    }
    
    
    /**
     * Dada una frase codificada que se le pasa como parámetro, la 
     * devuelve descodificada, sabiendo que la clave de codificación
     * ha sido desplazarla "n" caracteres que se le pasa como
     * parámetro. Por ejemplo, decodificar( "ipmb", 1 ) debería
     * devolver "hola"
     * 
     * @param  frase    frase a decodificar
     * @param  n        número de posiciones desplazadas
     * @return          frase decodificada según la regla
    */
    public static String decodificar( String frase, int n ){
        /*
         * COMPLETAR
         */
        return ""; //para que compile, cámbialo como corresponda
    }
    
    
    
    /**
     * Dada una cadena que se le pasa como parámetro, devuelve la 
     * cadena en orden inverso. Por ejemplo, si se le pasa "hola"
     * el método devuelve "aloh"
     * 
     * @param  original   cadena que se quiere invertir
     * @return            cadena invertida
     */
    public static String reverso( String original ){
        /*
         * Hay que iniializar res para poder hacer res += ...
         * Es equivalente a res = res + ... y una variable
         * no puede aparecer a la derecha de un = si no tiene valor
         * Si no lo hace, el compilador da un error (pruébalo)
         */
        String res = "";            //cadena con la respuesta          
        int n = original.length();  //longitud de la cadena original
        
        /*
         * Hacemos el bucle al revés porque para construir la cadena
         * de respuesta hay que hacerlo desde su primer carácter,
         * que será el último de la cadena original (en la posición n-1),
         * luego el penúltimo, el antepenúltimo... y así sucesivalente 
         * hasta el primero, que es el 0.
         */
        for( int i = n-1; i >= 0; i--){
            /*
             * para cceder al elemento que está en la posición "i"
             * de una cadea se emplea el método charAt() de la clase
             * String, hay que pasarle como parámetro la posición.
             * recuerda que empieza en 0.
             * Luego, construye "res" añadiendo un carácter cada vez
             */
            res += original.charAt( i );
        }
        
        return res;
    }
    
    
    
    /**
     * Dada una palabra que se le pasa como parámetro, comprueba
     * si es "capicúa", es decir, un palíndromo. Son palabras o frases
     * que seleen igual hacia adelante o hacia atrás. Por ejemplo, "ana",
     * "radar", "dabale arroz a la zorra el abad"
     * 
     * @param  palabra  palabra que se quiere comprobar
     * @return          true si es capicua, false en caso contrario
     */
    
    public static boolean palindromo( String palabra ){
        /*
         * Definimos la respuesta de entrada como true porque vamos a
         * hacer una operación parecida a la suma acumulada, pero con
         * "and": es cierto si el primer caracter es igual al último &
         * el segundo al penúltimo & el tecero al antepenúltimo & ..
         */
        boolean esPalindromo = true;    //respuesta
        /*
         * para que funciones con frases, hay que quitar los espacios
         * en blanco de toda la cadena. Si miras la documentación de la clase
         * String, verás que se hace con el método replace(). Le decimos que 
         * cambie el "espacio en blanco", que es " ", por "nada",
         * que es "". Se usan cadenas con "" en lugar de '' porque a la
         * función replace se le pueden pasar varios caracteres a la vez
         */
        palabra = palabra.replace( " ", "" );
        int n = palabra.length();   //longitud de la palabra
        int i = 0;                  //contador del bucle
        while(  i < n ){
           /* 
            * regla generaL.comprueba si el caracter de la posición i
            * el igual al caracte de la posición n-i. En la palabra "radar"
            * compararía 4-0, 3-1, 2-2, 1-3, 0-4. Fijate que funciona
            * incluso con longitudes impares.
            */
           boolean sonIguales = (palabra.charAt( i ) == palabra.charAt( n-i ));
           /*
            * como la suma acumulada. En el caso de booleanos, esPalíndromo
            * es true solo si todas las comparaciones dan true, por eso
            * se hace un "and" de todas las comparaciones una a una. Por eso
            * seinicializa a true. Si tan solo una comparación es false, 
            * el resultado será ya false
            */
           esPalindromo = esPalindromo & sonIguales;
           /*
            * expresión condensada
            * esPalindromo &= (palabra.charAt( i ) == palabra.charAt( n-i ));
            */
           esPalindromo &= (palabra.charAt( i ) == palabra.charAt( n-i ));
           i++;
        }
     
        return esPalindromo;
    }
    
    /*
     * esta es la versión de clase, un poco más eficiente
     */
    public static boolean capicua( String palabra ){
        boolean res = false;
        //aquí no tengo en cuenta lo de la frase
        int n = palabra.length();
        int i = 0;
        /*
         * Lo complicado es la guarda. Podemos abandonar el bucle en 
         * dos casos
         * 1. hay dos caracteres que no son iguales (el i y el n-i)
         * 2. hemos llegado a la mitad de la palabra (n / 2)
         * 
         * En el momento que detecte dos caracteres distintos, no hace falta
         * que sigamos comrobando el resto, asi que saldría del bucle. 
         * 
         * Si no sale del bucle y llega a la mitad de la palabra, es porque
         * hasta entonces todos los caracteres ahn sido iguales y la 
         * palabra es capicua. Cuando llegue a la mitad para. 
         */
        while( palabra.charAt( i ) == palabra.charAt( n-i ) && i < n / 2){
            /*
             * el bucle simplemente tiene que avanzar mientras los caracteres
             * sean iguales y no hayamos llegado a la mitad de la palabra
             * (eso quiere decir la condición de arriba)
             */
            i++;
        }
        /* 
         * el bucle acaba por dos motivos: hay que comprobar cuál de los 
         * dos ha sido, y es más fácil hacerlo con el contador. Si hemos 
         * llegado a la mitad de la palabra es porque todos los caracteres
         * han ido coincidiendo y entonces la palabra es capicua. En ese 
         * caso la respuesta será true, Si no, es false, que es el valor 
         * al que la hemos inicializado (puede hacerse al revés)
         */
        if( i >= n / 2)
            res = true;
        return res;
    }
    
    
    /**
     * Imprime por pantalla un triángulo de asteriscos, con 1 en la primera
     * línea, 2 en la segunda, 3 en la tercera...
     * *
     * **
     * ***
     * ****
     * 
     * @param  n   número de líneas a mostrar
     */
    public static void triangulo( int n){
        /*
         * el bucle externo se repite tantas veces como líneas se 
         * vayan a mostar
         */
        for( int i = 0; i < n; i++ ){
            /*
             * el bucle interno se repite tantas veces como asteriscos
             * hay que pintar en esa línea. Fíjate que se una una variable 
             * distinta "j" pero que está relacionada con el valor de "i"
             * que controla en qué línea estamos. 
             * i (línea)    el bucle se ejecuta (veces)
             * 0            1
             * 1            2
             * 2            3
             * en general, la línea hasta i+1 
             */
            for( int j = 0; j < i + 1; j++ ){
                /*
                 * Muestra por pantalla un asperisco. Fïjate que es print
                 * y no println, para que siga en la misma línea. Esto se
                 * hace tantas veces comoasteriscos necesites en la línea
                 */
                System.out.print("*");
            }
            /*
             * Cuando acabas una fila, para pasar a la siguiente, hay que 
             * saltar de línea, solamente. Hay que hacerlo antes de 
             * que se pase a la siguiente vuelta del bucle (otra linea)
             */
            System.out.print("\n"); //personalmente, prefiero esta opción
            //System.out.println("");
        }
        /*
         * NOTA: si lo ves más claro numerando las líneas 1, 2, 3...
         * puedes hacerlos bucles
         * for(i = 1; i <= n; i++)
         *      for( j = 1; j <= i; j++ )
         * las dos versiones son equivalentes y se repiten las mismas veces
         * (puedes probarlo) Elige la que veas más clara. A mi casi me
         * gusta más esta última
         */
    }

    /**
     * Imprime por pantalla un triángulo de asteriscos, con 1 en la primera
     * línea, 2 en la segunda, 3 en la tercera... pero al final de la línea
     *    *
     *   **
     *  ***
     * ****
     * 
     * @param  n   número de líneas a mostrar
     */
    public static void trianguloInverso( int n ){
        /*
         * COMPLETAR
         * Pista: 
         * - rellena con blancos las primeras posiciones
         * - mira cuántos blancos y cuantos * hay en cada línea
         * - busca una regla general, tipo i, n - i 
         */
    }
    
    /**
     * Imprime por pantalla un triángulo de asteriscos, con 1 en la primera
     * línea, 2 en la segunda, 3 en la tercera... centrado.
     *    *
     *   ***
     *  *****
     * *******
     * 
     * @param  n   número de líneas a mostrar
     */
    public static void trianguloCentrado( int n){
         /*
         * COMPLETAR
         * Pista: 
         * - rellena con blancos las primeras posiciones
         * - mira cuántos blancos y cuantos * hay en cada línea
         * - busca una regla general, tipo i, n - i 
         * - observa que la longitud de cada línea es simpre impar ¿Cömo se
         *   construye la secuencia 1, 3, 5, 7, 9...? Busca la regla en
         *   i  impar
         *   1  1
         *   2  3
         *   3  5
         *   4  7
         *   5  9
         *   Si te ayuda, piensa antes en una secuencia de números pares
         *   2, 4, 6, 8, 10
         */
    
    }
    
        
}

