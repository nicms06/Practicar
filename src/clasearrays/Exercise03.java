/**
 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9. 
 * Luego ordena los valores del array y los mostrará por pantalla.
 */

package clasearrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Creamos un objeto del tipo Random
		Random rand = new Random();

		//Array de tamaño 30
		int[] array = new int[30];
		
		//Creamos un bucle para llenar el array de números aleatorios entre 0 y 9
		for (int i = 0; i < array.length; i++) {
			//Le introducimos un número aleatorio entre 0 y 9
			array[i] = rand.nextInt(0, 10);
		}
		
		//Mostramos el array desordenado
		System.out.println("Array desordenado: " + Arrays.toString(array));
		
		//ordenamos el array
		Arrays.sort(array);
		
		//Mostramos el array ordenado
		System.out.println("Array ordenado: " + Arrays.toString(array));
		
	}

}
