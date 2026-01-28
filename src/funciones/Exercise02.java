/*
 * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.
 */

package funciones;

import java.util.Arrays;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Creamos una tabla con valores
		int[] tabla = {15, 34, 12, 7, 9, 10, 54, 65, 9};
		
		//Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
		
		//Llamamos a la función y la imprimimos por pantalla
		System.out.println("\nMax: " + maximo(tabla));
	
	}
	
	//Función para calcular el valor más alto dentro de una tabla
		static int maximo(int t[]) {
			
			//Igualamos la variable max al primer valor
			int max = t[0];
			
			//Recorremos la tabla con un bucle
			for (int i = 1; i < t.length; i++) {
				if (max < t[i]) {
					max = t[i];
				}
			}
			//Devolvemos max
			return max;
			
		}

}
