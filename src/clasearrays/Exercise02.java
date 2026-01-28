/*
 * Crea un programa que pida al usuario 20 valores enteros e 
 * introduzca los 10 primeros en un array y los 10 últimos en otro array. 
 * Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
 */

package clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos los dos arrays
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		//Creamos un bucle para pedir 20 números y meterlos en sus respectivos arrays
		for (int i = 0; i < array1.length + array2.length; i ++) {
			//Pedimos un número
			System.out.println("Introduzca el número " + (i+1) + ": ");
			int num = sc.nextInt();
			
			//Si el número está entre i = 0 e i = 9 se mete al primer array, si no es así, se mete al segundo
			if (i>=0 && i<=9) {
				array1[i]= num;
			}
			else {
				array2[i-10] = num;
			}
		}
		
		//Mostramos ambos arrays
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		
		//Comparamos los arrays
		String sonIguales = Arrays.equals(array1, array2) ? "Son iguales" : "No son iguales";
		
		//Imprimimos si son iguales o no
		System.out.println("\n" + sonIguales);
		
		//Cerramos el Scanner
		sc.close();

	}

}
