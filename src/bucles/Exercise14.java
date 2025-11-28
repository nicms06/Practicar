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
			
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
