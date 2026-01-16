/*
 * Escribe la función: int buscar(int t[], int clave), que busca de forma secuencial en la tabla t el valor clave. 
 * En caso de encontrarlo, devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1.
 */

package funciones;

public class Exercise04 {

	public static void main(String[] args) {

		//Creamos un nuevo array
		int[] tabla = {7, 24, 76, 5, 13, 92};
		
		//Creamos la variable claveCorrecta
		int claveCorrecta = 76;
		
		//Creamos la variable claveFalsa
		int claveFalsa = 27;
		
		//Llamamos a la función con los parámetros correctos
		System.out.println("Posición: " + buscar(tabla, claveCorrecta));
		
		//Llamamos a la función con los parámetros falsos
		System.out.println("Posición: " + buscar(tabla, claveFalsa));

	}
	
	//Función que busca de forma secuencial en la tabla t el valor clave
	static int buscar(int t[], int clave) {
		
		//Buscamos el valor de la clave dentro de la tabla
		for (int i = 0; i < t.length; i++) {
			if (clave == t[i]) {
				return i+1;
			}
		}
		
		//Si no se ha encontrado devolvemos -1
		return -1;
	}

}
