/*
 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de las tablas de multiplicar del 1 al 10 
 * (cada tabla de multiplicar en una fila). Muestra la tabla por pantalla. 
 */

package arraysbidimensionales;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Creamos una matriz de 10 filas y 10 columnas
		int[][] tablas = new int [10][10];
		
		//Creamos un blucle donde vamos a ir rellenado la matriz con las tablas de multiplicar
		for (int i = 0; i < tablas.length; i++) {
			for (int j = 0; j < tablas[i].length; j++) {
				tablas[i][j] = (i+1) * (j+1);
			}
		}
		
		//Creamos otro bucle donde mostramos la matriz
		for (int i = 0; i < tablas.length; i++) {
			for (int j = 0; j < tablas[i].length; j++) {
				System.out.print((i+1) + "x" + (j+1) + "=" + tablas[i][j] + " | ");
			}
				System.out.println("\n");
		}
		
	}

}
