/*
 * Pide n y dibuja un tablero n x n alternando # y espacios.
 * Ejemplo (n = 6)
 * # # # 
 *  # # #
 * # # # 
 *  # # #
 * # # # 
 *  # # #
 */

package bucles;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		//Crear un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable num
		int num;
		
		//Le pedimos al usuario num
		System.out.print("Introduzca num: ");
		num = sc.nextInt();
		
		//El número debe de ser mayor que 1. Cuando sea menor, dará un error y volerá a pedir números hasta qu
		while (num <= 1) {
			System.out.print("ERROR. El número debe de ser mayor que 1: ");
			//Volvemos a pedir el número
			num = sc.nextInt();
		}
		
		//Creamos un bucle for que se encargará de los saltos de línea
		for (int i = 0; i < num; i++) {
			
			//Creamos un bucle para dibujar la figura
			for (int j = 0; j < num/2; j++) {
				
				//Si i es impar dibujaremos "# " y si es par dibujaremos " #"
				if (i % 2 ==0) {
					System.out.print("# ");
				}
				else {
					System.out.print(" #");
				}
				
			}
		
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
