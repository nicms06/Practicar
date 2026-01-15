/*
 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores. 
 * Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) 
 * y luego muestre las puntuaciones en orden descendente (de la más alta a la más baja).
 */

package clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un nuevo array donde introduciremos las 8 puntuaciones
		int[] puntuaciones = new int[8];
		
		//Creamos un bucle donde vamos a pedirle al usuario que de valores a todas las posiciones del array
		for (int i = 0; i < puntuaciones.length; i++) {
			//Le pedimos al usuario un valor entre 1000 y 2800
			System.out.print("Puntuación " + (i+1) + " (1000-2800): ");
			puntuaciones[i] = sc.nextInt();
			
			//Nos aseguramos de que introduzca unn valor válido
			while (puntuaciones[i] > 2800 || puntuaciones[i] < 1000) {
				System.out.print("Error: El valor debe de estar comprendido entre 1000 y 2800: ");
				puntuaciones[i] = sc.nextInt();
			}
		}
		
		//Ordenamos el array
		Arrays.sort(puntuaciones);
		
		//Mostramos el array en orden inverso
		for (int i = puntuaciones.length -1; i >= 0; i--) {
			System.out.println(puntuaciones[i]);
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
