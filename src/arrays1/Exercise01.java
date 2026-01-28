/*
 * Crea una tabla de enteros de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100. 
 */

package arrays1;

import java.util.Random;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Llamamos a la función random
		Random rand = new Random();
		
		//Declaramos el array que tendrá longitud 10
		int[] array = new int[10];
		
		//Bucle donde vamos a completar el array con 10 números aleatorios entre 1 y 100
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1, 101);
		}
		
		//Mostramos el array, para ello necesitaremos otro bucle para ir imprimiendo cada interacción
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posición " + (i+1) + ": " + array[i]);
		}

	}

}
