/*
 * Define una función que reciba una tabla bidimensional y devuelva un booleano para indicar si la matriz es o no simétrica. 
 * Una matriz se dice que es simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la matriz. 
 * Define un método main que llame a la función y muestre por pantalla el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
 */

package funciones;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario el número de filas
		System.out.print("Introduzca el número de filas: ");
		int filas = sc.nextInt();
		
		//Le pedimos al usuario el número de columnas
		System.out.print("Introduzca el número de columnas: ");
		int columnas = sc.nextInt();
		
		System.out.println();
		
		//Llamamos a la función rellenarMatriz y la imprimimos
		int[][] t = rellenarMatriz(filas, columnas, sc);
		
		System.out.println();
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Llamamos a la función esSimetrica e imprimimos el resultado
		String solucion = esSimetrica(t) ? "Es simétrica" : "No es simétrica";
		
		System.out.println("\n" + solucion);
		
		//Cerramos el Scanner
		sc.close();

	}
	
	//Función que recibe una tabla bidimensional y devuelve un booleano para indicar si la matriz es o no simétrica.
	static boolean esSimetrica (int t[][]) {
		
		//Si el número de filas y de columnas es distinto, la matriz no será simétrica
		if (t.length != t[0].length) {
			return false;
		}
		
		//En el calso en el que tenga el mismo número de filas que de columnas, la compararemos con su traspuesta
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if (t[i][j] != t[j][i]) {
					return false;
				}
			}
		}
		
		//Si todos los valores coinciden, devolvemos true
		return true;
		
	}
	
	//Función para rellenar por teclado una matriz
	static int[][] rellenarMatriz (int filas, int columnas, Scanner sc){
		
		//Creamos una matriz
		int[][] t = new int[filas] [columnas];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				//Le pedimos al usuario un valor
				System.out.print("Valor " + (i+1) + " | " + (j+1) + ": ");
				t[i][j] = sc.nextInt();
			}
		}
		
		//Devolvemos la matriz
		return t;
	}

}
