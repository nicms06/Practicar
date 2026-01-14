/*
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y 
 * luego lo recorra para calcular la suma de todos los números y, además, averiguar el máximo y mínimo y mostrarlos por pantalla.
 */

package arrays1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
		
		//Creamos el array de longitud 10
		double[] array = new double[10];
		
		//Variable para la suma de todos los números del array
		double sum = 0;
		
		//Variable para el número más pequeño del array
		double min;
		
		//Variable para el número más grande del array
		double max;
		
		//Creamos un bucle donde vamos a pedir 10 números y a introducirlos dentro del array
		for (int i = 0; i < array.length; i++) {
			
			//Pedimos un número y lo introducimos en el array
			System.out.print("Número " + (i+1) + ": ");
			array[i] = sc.nextDouble();
		}
		
		System.out.println("\n-----< RESULTADO >-----\n");
		
		//Asignamos tanto a min como a max el primer número del array
		min = array[0];
		max = array[0];
		
		//Creamos otro bucle para recorrer el array y ver la suma, minimo, maximo e imprimirlo todo por pantalla
		for (int i = 0; i < array.length; i++) {
			//Primero vamos a sumar a la variable sum cada interración
			sum += array[i];
			
			//Vemos si esta interacción es mayor que el máximo actual, si es así le cambiamos el valor
			if (max < array[i]) {
				max = array[i];
			}
			
			//Vemos si esta interración es menor que el mínimo actual, si es así le cambiamos el valor
			if (min > array[i]) {
				min = array[i];
			}
			
			//Mostramos el Array
			System.out.println("Número " + (i+1) + ": " + array[i]);
			
		}
		
		//Mostramos el mínimo, máximo y suma
		System.out.println("\nSuma: " + sum);
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		
		//Cerramos el Scanner
		sc.close();

	}

}
