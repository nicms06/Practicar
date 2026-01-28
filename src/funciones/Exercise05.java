/*
 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y devuelve una tabla con todos los índices 
 * de los elementos donde se encuentra el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla t, 
 * la función devolverá una tabla vacía.
 */

package funciones;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
		
		//Creamos un nuevo array de 10 valores
		int[] array = new int[10];
		
		//Le pedimos al usuario un valor
		System.out.print("Introduce un valor: ");
		int valor = sc.nextInt();
		
		//Le decimos al usuario que rellene un array de 10 números
		for (int i = 0; i < array.length; i++) {
			System.out.print("Número " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
		
		//Llamamos a la función buscarTodos e imprimimos el resultado
		System.out.println(Arrays.toString(buscarTodos(array, valor)));
		
		//Cerramos el Scanner
		sc.close();

	}
	
	//Creamos la función que crea y devuelve una tabla con todos los índices de los elementos donde se encuentra el valor de búsqueda
	static int[] buscarTodos(int t[], int valor) {
		
		//Creamos la variable de numPosiciones
		int numPosiciones = 0; 
		
		//Recorremos el array para ver el número de valores del array con las posiciones
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				numPosiciones ++;
			}
		}
		
		//Creamos un array de longitud numPosiciones
		int[] valores = new int[numPosiciones];
		
		int indice = 0;
		//Creamos otro bucle para añadir los índices
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				valores[indice] = i+1;
				indice ++;
			}
		}
		
		//Devolvemso el array
		return valores;
		
	}

}

