/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999. Estos números se deben introducir en un array de 4 filas por 5 columnas. 
 * Seguidamente, muestra el array por pantalla junto con las sumas parciales de filas y columnas, igual que si de una hoja de cálculo se tratara. La suma 
 * total debe aparecer en la esquina inferior derecha. Un ejemplo de cómo deben mostrarse dichas sumas parciales sería:
 */

package arraysbidimensionales;

import java.util.Random;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Creamos un nuevo objeto de la clase Random
		Random rand = new Random();
		
		//Creamos la matriz de 4 filas y 5 columnas
		int[][] matriz = new int[4][5];
		
		//Variable para la suma de las filas
		int sumFilas = 0;
		
		//Creamos otra matriz para recorrerla por columnas
		int[] sumColumnas = new int[matriz[0].length];
		
		//Variable para la suma total
		int sumTotal = 0;
		
		//Bucle para rellenar la matriz con números aleatorios
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Le introducimos un número aleatorio entre 100 y 999
				matriz[i][j] = rand.nextInt(100, 1000);
			}
		}
		
		//Bucle para mostrar la matriz
		for (int i = 0; i < matriz.length; i++) {
			//Reinicimamos la suma de las filas en cada vuelta
			sumFilas = 0;
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				//Calculamos la suma de las filas
				sumFilas += matriz[i][j];
				
				//Sumamos las columnas
				sumColumnas[j] += matriz[i][j];
				
				//Calculamos la suma total
				sumTotal += matriz [i][j];
				
				//Imprimimos el valor matriz[i][j]
				System.out.print(matriz[i][j] + "\t");
			}
			//Mostramos el sumatorio de la suma de las filas
			System.out.println("|\tSF" + i + " = " + sumFilas);
			
		}
		
		//Bucle para mostrar la suma de las columnas
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.print("SC " + i + " = " +sumColumnas[i] + "   ");
		}
		
		//Mostramos la suma final
		System.out.print("Suma Total = " + sumTotal);

	}

}
