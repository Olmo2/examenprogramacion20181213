package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner teclado = new Scanner(System.in);
		int respuesta = 0;
		int retry = 1;
		int intentos = 0;
		int numero = r.nextInt (((20-10)+1)+10 ); 
		System.out.println("Adivina el numero aleatorio entre 100 y 200");
		long Marty = System.currentTimeMillis();
		do {
		
		do {
			respuesta = teclado.nextInt();
			System.out.print("El numero no es correcto, lo siento amigo, intentalo de nuevo ;)");
			intentos++;
		}while(respuesta != numero);
		 long Doc = System.currentTimeMillis();
		System.out.println("¡Correcto!, el numero era: " + numero);
		System.out.println("Nº De Intentos: " + intentos);
		System.out.println("Has tardado: " + (Doc-Marty) + " Milisegundos");
		System.out.println("¿Quiéres intentanrlo otra vez? SI(1)/NO(0)");
		retry = teclado.nextInt();
		}while(retry ==1);
	}

}
