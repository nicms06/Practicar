/*
 * Diseñar un programa que solicite al usuario 5 números decimales y los almacene en una tabla. 
 * Utiliza el mismo bucle tanto para solicitar los 5 números como para almacenarlos en la tabla. 
 * A continuación, en un bucle distinto, mostrar por consola los números en el mismo orden en el que se han introducido.
 */

package arrays1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
		
		//Declaramos el array
		double[] array = new double[5];
		
		//Creamos un bucle donde vamos a pedirle al usuario 5 números decimales y vamos a ir rellenando el array con ellos
		for (int i = 0; i < array.length; i++) {
			
			//Pedimos un número y añadimos el número al array
			System.out.print("Número " + (i+1) + ": ");
			array[i] = sc.nextDouble();
			
		}
		
		//Creamos otro bucle para mostrar el array
		System.out.println("\n------< ARRAY >------\n");
		for (int i = 0; i < array.length; i++) {
			//Mostramos la interración
			System.out.println("Número " + (i+1) + ": " + array[i]);
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
