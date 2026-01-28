/*
 * Realiza un programa que cree dos tablas, la primera con los 6 números de una apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, 
 * la segunda (ordenada) con los 6 números de la combinación ganadora. La combinación ganadora debe establecerse en el momento de crear la tabla. 
 * El programa devolverá el número de aciertos.
 */

package clasearrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise06 {

	public static void main(String[] args) {

		//Creamos un nuevo objeto de la clase Random
		Random rand = new Random();
		
		//Creamos el array que va a contener los números aleatorios
		int[] apuesta = new int[6];
		
		//Creamos el array con la combinación ganadora (ordenada de menor a mayor)
		int[] combGanadora = {2, 9, 16, 35, 37, 44};
		
		//Creamos una variable para el número de aciertos
		int aciertos = 0;
		
		//Rellenamos la apuesta con úmeros aleatorios entre 1 y 49
		for (int i = 0; i < apuesta.length; i++) {
			//Le asignamos un valor 
			apuesta[i] = rand.nextInt(1, 50);
		}
		
		//Vamos comparando los arrays valor por valor
		for (int i = 0; i < apuesta.length; i++) {
			for (int j = 0; j < combGanadora.length; j++) {
				if (apuesta[i] == combGanadora[j]) {
					aciertos ++;
				}
			}
		}
		
		//Mostramos ambos arrays
		System.out.println("Tu apuesta: " + Arrays.toString(apuesta));
		System.out.println("Apuesta ganadora: " + Arrays.toString(combGanadora));
		
		//Mostramos el número de aciertos
		System.out.println("Ha acertado " + aciertos + " dígitos.");
		
	}

}
