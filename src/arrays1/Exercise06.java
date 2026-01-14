/*
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10. 
 * Luego pedirá un valor N y mostrará en qué posiciones del array aparece N. 
 */

package arrays1;

import java.util.Random;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Creaamos un objeto de la clase Random
		Random rand = new Random();
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un nuevo array de tamaño 100
		int[] array = new int [100];
		
		//Bucle para rellenar el array de número aleatorios entre 1 y 10
		for ( int i = 0; i < array.length; i++) {
			//Rellenamos la matriz con número aleatorios entre 1 y 10
			array[i] = rand.nextInt(1, 11);
		}
		
		//Pedimos un valor
		System.out.print("Introduzca un valor entre 1 y 10: ");
		int num = sc.nextInt();
		
		//El número debe de estar entre 1 y 10
		while (num > 10 || num < 1) {
			System.out.print("Error: ");
			num = sc.nextInt();
		}
		
		System.out.println("\nNúmero encontrado en las posiciones:\n");
		
		//Creamos otro bucle para recorrer la matriz
		for ( int i = 0; i < array.length; i++) {
			
			//Comprobamos si el número introducido coincide con esta interración
			if (num == array[i]) {
				//Mostramos la posición
				System.out.println(i);
			}
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
