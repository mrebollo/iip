
/**
 * Programa que adivina un número que ha pensado el ordenador.
 * cambio: Indica los intentos que quedan
 * 
 * @author IIP 16-17 (@mrebollo) 
 * @version 2.0
 * @since 20161027
 */
import java.util.Scanner;

public class AdivinarAtras
{
    public static void main() {
        Scanner input = new Scanner(System.in);
        int pensado = (int)(Math.random() * 101);

        System.out.println( "Introduce un número entre 0 y 100:");
        int usuario;
        boolean adivinado = false;
        for ( int i = 10; i > 0 && !adivinado; i-- ) {
            System.out.print("(" + i + ") ");
            usuario = input.nextInt();
            if (pensado > usuario) {
                System.out.println("El número es mayor");
            } else if (pensado < usuario) {
                System.out.println("El número es menor");
            } else {                
                System.out.println("¡¡lo has adivinado!!");
                adivinado = true;
            }
        } //for
        if (!adivinado) 
            System.out.println( "Mi número era el " + pensado );
    } //main()
}
