/*
 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99. 
 * Luego pedirá por teclado un valor y se mostrará por pantalla si ese valor existe en el array. 
 */

package clasearrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		//Creamos un objeto de la clase Random
		Random rand = new Random();
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un array de tamaño 1000
		int[] array = new int[1000];
		
		//Creamos un bucle para rellenar el array
		for (int i = 0; i < array.length; i ++) {
			//Rellenamos el array con números aleatorios entre 0 y 99
			array[i] = rand.nextInt(0, 100);
		}
		
		//Pedimos un valor por teclado
		System.out.print("Introduzca un valor entre 0 y 99: ");
		int num = sc.nextInt();
		
		//Nos aseguramos de que es un valor válido
		while (num > 99 || num < 0) {
			System.out.print("Error: El valor debe de estar entre 0 y 99: ");
			num = sc.nextInt();
		}
		
		//Ahora buscaremos ese número en el array.
		//Usaremos una búesqueda binaria, por lo tanto, necesitamos ordenar el array primero
		Arrays.sort(array);
		
		//Una vez ordenado el array, procedemos a buscar el valor
		int posicion = Arrays.binarySearch(array, num);
		
		//Si la variable posición es mayor a 0, se habrá encontrado el número
		if (posicion >= 0) {
			System.out.println("El valor existe en el array");
		}
		else {
			System.out.println("El valor no existe en el array");
		}
		
		//Cerramos el Scanner
		sc.close();
	}

}
