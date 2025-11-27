/*
 * Pide n y dibuja un cuadrado con borde de * y el interior vacío.

	Ejemplo (n = 5)

	*****
	*   *
	*   *
	*   *
	*****
 */

package bucles;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//declaramos las variables
		int lado;
		
		System.out.println("Introduce el lado");
		lado = sc.nextInt();
		
		for (int i = 0; i < lado; i++) {
			
			if (i == 0 || i == lado -1) {
				for (int j = 0; j < lado; j++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				
				for (int j = 0; j < lado -2; j++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
