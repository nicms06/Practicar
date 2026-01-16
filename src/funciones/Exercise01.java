/*
 * Realiza una función que reciba como parámetro una tabla de enteros y 
 * devuelva la suma de todos los valores almacenados en la tabla. 
 * Prueba el comportamiento de la función en un método main.
 */

package funciones;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Creamos una tabla con valores
		int[][] tabla = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		//Mostramos la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j <tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		//Llamamos a la función sumaTabla, le damos como parámetro nuestra tabla y la mostramos
		System.out.println("\nSuma = " + sumaTabla(tabla));
		
		
	}
	
	//Función para sumar los valores de una tabla
	static int sumaTabla (int t[][]) {
		
		//Variable que contendrá la suma de todos los valores de la tabla
		int suma = 0;
		
		//Bucle para ir sumando cada valor de la tabla 
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j <t[i].length; j++) {
				suma += t[i][j];
			}
		}
		
		//Devolvemos la suma 
		return suma;
	}

}

