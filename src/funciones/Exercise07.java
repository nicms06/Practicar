/*
 * Realiza una función que reciba una tabla de dos dimensiones. A continuación, debe devolver un array de dos posiciones que contenga el mínimo en la posición 0 y el máximo en la posición 1. 
 * Define un método main que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a la función 
 * con este array y mostrar por consola los valores mínimo y máximo de la tabla.
 */

package funciones;

import java.util.Random;
import java.util.Arrays;

public class Exercise07 {

	public static void main(String[] args) {
		
		//Creamos un array de 6 filas y 10 columnas
		int[][] numeros = new int[6][10];
		
		//Llamamos a la función rellenarMatriz pasándole como parámetro la matriz numeros
		rellenarMatriz(numeros);
		
		//Mostramos la matriz
		
		System.out.println("MATRIZ: \n");
		
		for (int i= 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Llamamos a la funcion calcularMinMax y mostramos el array
		System.out.println("\nMínimo y máximo: " + Arrays.toString(calcularMinMax (numeros)));
		
		
	}
	
	//Función que recibe una tabla de dos dimensiones
	static int[] calcularMinMax (int t[][]){
		
		//Declaramos las variables min y max y las inicializamos en el primer valor de la tabla
		int min = t[0][0];
		int max = t[0][0];
		
		//Recorremos la matriz
		for (int i = 0; i < t.length; i ++) {
			for (int j = 0; j < t[i].length; j++) {
				//Si min es mayor que el valor de la posición actual, le asignamos el valor
				if (min > t[i][j]) {
					min = t[i][j];
				}
				
				//Si max es menor que el valor de la posición actual, le asignamos el valor
				if (max < t[i][j]) {
					max = t[i][j];
				}
			}
		}
		
		//Creación del array de 2 posiciones y le asignamos el mínimo en la posición 0 y el máximo en la posición 1
		int[] minYMax = {min, max};
		
		//Devolvemos el array
		return minYMax;
	}
	
	//Función para rellenar una matriz con números aleatorios 
	static void rellenarMatriz (int t[][]){
		
		//Creamos un nuevo objeto de la clase Random
		Random rand = new Random();
		
		//Recorremos la matriz
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				//Le asignamos a la posición un número aleatorio entro 0 y 1000
				t[i][j] = rand.nextInt(0, 1001);
			}
		}
		
	}

}
