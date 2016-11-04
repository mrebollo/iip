/**
 * Programa que adivina un número que ha pensado el ordenador.
 * 
 * @author IIP 16-17 (@mrebollo) 
 * @version 1.0
 * @since 20161027
 */
import java.util.Scanner;

public class Adivinar {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int pensado = (int)(Math.random() * 101);

        System.out.println( "Introduce un número entre 0 y 100:");
        int usuario;
        boolean adivinado = false;
        for ( int i = 1; i < 11 && !adivinado; i++ ) {
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
    } //main()
}
