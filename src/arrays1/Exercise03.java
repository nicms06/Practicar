/*
 * Escribe un programa que lea 10 números por teclado, los almacene en una tabla, 
 * y que luego los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse.
 * */

package arrays1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos el array
		int[] array = new int[10];
		
		//Creamos un bucle para pedir 10 número por teclado y añadirlo al array
		for (int i = 0; i < array.length; i++) {
			//Pedimos un número y lo añadimos al array
			System.out.print("Número " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
		
		//Creamos otro bucle para mostrar el array en orden inverso
		for (int i = array.length - 1; i >= 0; i--) {
			//Mostramos el array
			System.out.println("Número " + i + ": " + array[i]);
		}
			
			
		//Cerramos el Scanner
		sc.close();

	}

}
