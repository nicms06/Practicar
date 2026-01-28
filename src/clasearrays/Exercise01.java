/*
 * Crea un programa que pida al usuario dos valores, tamaño y valor, 
 * y luego cree un array del tamaño dado y que almacene valor en todas 
 * sus posiciones. Luego muestra el array por pantalla.
 */

package clasearrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise01 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables tamaño y valor
		int tamaño;
		int valor;
		
		//Le pedimos el tamaño al usuario
		System.out.print("Introduzca el tamaño del array: ");
		tamaño = sc.nextInt();
		
		while(tamaño < 1) {
			System.out.print("Error: ");
			tamaño = sc.nextInt();
		}
		
		//Le pedimos el valor al usuario
		System.out.print("Introduzca el valor que desea introducir en el array: ");
		valor = sc.nextInt();
		
		//Creamos el array
		int[] numeros = new int[tamaño];
		
		//Creamos un bucle para introducir el valor en todas sus posiciones
		for ( int i = 0; i < numeros.length; i++){
			//Introducimos el valor
			numeros[i] = valor;
		}
		
		//Imprimimos el array con la clase Arrays
		System.out.print(Arrays.toString(numeros));
		
		//Cerramos el Scanner
		sc.close();

	}

}
