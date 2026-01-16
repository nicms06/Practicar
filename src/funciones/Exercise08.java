/*
 * Realiza una función que reciba una tabla bidimensional y devuelva en otro array distinto su transposición.
 * Define un método main que llame a esta función pasándole una tabla bidimensional y muestre por pantalla el resultado.
 */

package funciones;

import java.util.Scanner;
import java.util.Random;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
				
		//Pedimos el número de filas
		System.out.print("Introduzca el número de filas: ");
		int filas = sc.nextInt();
				
		//Pedimos el número de columnas
		System.out.print("Introduzca el número de columnas: ");
		int columnas = sc.nextInt();
		
		System.out.println("Matriz: \n");
		
		//Llamamos a la función pedirMatriz y la imprimimos 
		int[][] matriz = pedirMatriz(filas, columnas);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Imprimimos el valor
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Llamamos a la función matrizTraspuesta
		int[][] matrizTraspuesta = matrizTraspuesta(matriz);
		
		System.out.println("\nMatriz Traspuesta: \n");
		
		for (int i = 0; i < matrizTraspuesta.length; i++) {
			for (int j = 0; j < matrizTraspuesta[i].length; j++) {
				//Imprimimos el valor
				System.out.print(matrizTraspuesta[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();

	}
	
	//Función genera un array de dos dimensiones con valores aleatorios entre 0 y 100
	 static int[][] pedirMatriz (int filas, int columnas){
		
		//Creamos un nuevo objeto de la clase Random
		Random rand = new Random();
		
		//Creamos un array de dos dimensiones
		int[][] t = new int[filas][columnas];
		
		//Recorremos el array
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				//Le añadimos un valor aleatorio entre 0 y 100
				t[i][j] = rand.nextInt(0, 101);
			}
		}
		
		//Devolvemos la matriz
		return t;
		
	}
	 
	//Función que devulve la traspuesta de una matriz dada
	static int[][] matrizTraspuesta(int t[][]){
		
		//Creamos una matriz nueva
		int[][] matrizTraspuesta = new int [t[0].length][t.length];
		
		//Imprimimos la matriz con los valores cambiados
		for (int i = 0; i < matrizTraspuesta.length; i++) {
			for (int j = 0; j < matrizTraspuesta[i]. length; j++) {
				//Le damos los valores
				matrizTraspuesta[i][j] = t[j][i];
			}
		}
		
		//Devolvemos la matriz
		return matrizTraspuesta;
			 
	}

}
