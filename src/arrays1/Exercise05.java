/*
 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A continuación, en un bucle distinto, 
 * recorrerá esa tabla y mostrará esos números junto con la palabra “par” o “impar” según proceda.
 */

package arrays1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un nuevo array de longitud 8
		int[] array = new int[8];
		
		//Creamos un bucle donde vamos a pedir 8 números y a introducirlos dentro del array
		for (int i = 0; i < array.length; i++) {
			
			//Pedimos un número y lo introducimos en el array
			System.out.print("Número " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
		
		//Creamos otro array para ver recorrer el bucle 
		for (int i = 0; i < array.length; i++) {
			String esPar = array[i] % 2 == 0 ? "Par" : "Impar";
			
			//mostramos el array y decimos si es par o impar 
			System.out.println("Número " + (i+1) + ": " + array[i] + " -- " + esPar);
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
