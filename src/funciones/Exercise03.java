/*
 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada 
 * de la longitud especificada, que se encuentra rellena con números pares aleatorios 
 * comprendidos entre 2 hasta fin inclusive.
 */

package funciones;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la lingitud
		System.out.print("Introduzca la longitud: ");
		int longitud = sc.nextInt();
		
		//Pedimos el fin
		System.out.print("Introduzca el fin: ");
		int fin = sc.nextInt();
		
		//Llamamos a la función con los parámetros longitud y fin y la imprimimos
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		
		//Cerramos el Scanner
		sc.close();

	}
	
	//Creacción de la función
	static int[] rellenaPares(int longitud, int fin) {
		
		//Creamos un objeto de la clase random
		Random rand = new Random();
		
		//Creamos una tabla de longitud dada por el usuario
		int[] tabla = new int[longitud];
		
		//la llenamos de números pares entre 2 y "fin"
		for (int i = 0; i < tabla.length; i++) {
			//Añadimos un número aleatorio entre 2 y longitud
			tabla[i] = rand.nextInt(2, fin + 1);
			
			//El número debe de ser par
			if (tabla[i] % 2 != 0) {
				tabla [i] -= 1;
			}
		}
		
		//Ordenamos la tabla
		Arrays.sort(tabla);
		
		//Devolvemos la tabla
		return tabla;
	}

}

