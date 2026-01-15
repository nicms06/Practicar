/*
 * Crea un programa que cree un array de tipo entero e introduzca la siguiente secuencia de valores: 
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces el 10, y 
 * luego la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
 */

package clasearrays;

import java.util.Arrays;

public class Exercise07 {

	public static void main(String[] args) {
		
		//Creamos un array 
		int[] array = new int[55];
		
		int index = 0;
		
		for (int n = 1; n <=10; n++) {
			Arrays.fill(array, index, index + n, n);
			index+=n;
		}
		
		System.out.println(Arrays.toString(array));

	}

}
