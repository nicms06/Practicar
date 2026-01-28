/*
 * Escribe un programa que pida las dimensiones de una tabla bidimensional al usuario (número de filas y número de columnas). 
 * A continuación, crea dicha tabla bidimensional y rellénala de la siguiente forma: el elemento de la posición [i][j] debe 
 * contener el valor 10 * i + j. A continuación, muestra la tabla por consola.
 */

package arraysbidimensionales;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número de filas
		System.out.print("Introduzca el número de filas: ");
		int filas = sc.nextInt();
		
		//Pedimos el número de columnas
		System.out.print("Introduzca el número de columnas: ");
		int columnas = sc.nextInt();
		
		//Creamos la matriz con los valores dados por el usuario
		int[][] matriz = new int[filas][columnas];
		
		//Creamos un bucle para rellenar la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Le damos el valor que nos da el enunciado
				matriz[i][j] = 10 * i + j;
			}
		}
		
		//Creamos otro bucle para mostrar la matriz por pantalla
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();
		

	}

}
